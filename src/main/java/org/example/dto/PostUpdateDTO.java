package org.example.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.openapitools.jackson.nullable.JsonNullable;

@Setter
@Getter
public class PostUpdateDTO {
    private JsonNullable<Long> authorId;
    private JsonNullable<String> slug;
    private JsonNullable<String> name;
    private JsonNullable<String> body;
}
