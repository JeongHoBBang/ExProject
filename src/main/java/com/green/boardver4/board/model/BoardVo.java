package com.green.boardver4.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardVo {
    private Long iuser;
    private Long iboard;
    private String title;
    private String text;
    private String created_At;
    private String nm;
}
