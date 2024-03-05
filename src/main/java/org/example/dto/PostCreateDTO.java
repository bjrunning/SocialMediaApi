package org.example.dto;

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
