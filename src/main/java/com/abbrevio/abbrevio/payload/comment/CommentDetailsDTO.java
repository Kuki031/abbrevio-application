package com.abbrevio.abbrevio.payload.comment;

import com.abbrevio.abbrevio.payload.user.UserDTO;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CommentDetailsDTO {
    private Long id;

    @NotBlank(message = "comment cannot be blank")
    private String content;
    private LocalDateTime createdAt;
    private UserDTO user;
}
