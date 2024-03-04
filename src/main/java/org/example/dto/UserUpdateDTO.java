package org.example.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserUpdateDTO {
    private String firstName;
    private String lastName;
}
