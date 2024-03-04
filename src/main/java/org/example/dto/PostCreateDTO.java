package org.example.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostCreateDTO {
    private Long authorId;
    private String slug;
    private String name;
    private String body;
}
