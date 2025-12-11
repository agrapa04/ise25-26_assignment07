package de.seuhd.campuscoffee.api.dtos;

import jakarta.validation.constraints.*;
import lombok.Builder;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.time.LocalDateTime;

/**
 * DTO record for POS metadata.
 */
@Builder(toBuilder = true)
public record ReviewDto (
    @Nullable Long id
    // TODO: Implement ReviewDto
    @Nullable LocalDateTime createdAt,
    @Nullable LocalDateTime updatedAt,
    @NotNull
    @NonNull Long posId,
    @NotNull
    @NonNull Long authorId,
    @NotNull
    @Size(min = 1, max = 255, message = "Review must be between 1 and 255 characters long.")
    @NonNull String review,
    @Nullable Boolean approved

) implements Dto<Long> {
    @Override
    public @Nullable Long getId() {
        return id;
    }
}
