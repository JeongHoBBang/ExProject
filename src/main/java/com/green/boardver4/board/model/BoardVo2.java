package com.green.boardver4.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardVo2 {
    private Long iuser;
    private Long iboard;
    private String title;
    private String text;
}
