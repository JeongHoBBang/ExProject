package com.green.boardver4.board.model;

import lombok.Data;

@Data
public class BoardDto {
    private Long iuser;
    private String nm;
    private String title;
    private String text;
    private String createdAt;
}
