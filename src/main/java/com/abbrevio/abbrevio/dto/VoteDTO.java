package com.abbrevio.abbrevio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VoteDTO {

    private MeaningDTO meaningId;
    private UserDTO userId;
}
