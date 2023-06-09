package com.green.boardver4.board.model;

import lombok.Data;

@Data
public class BoardUpdDto {
    private Long iuser;
    private Long iboard;
    private String title;
    private String text;
}
