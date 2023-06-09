package com.green.boardver4.board.model;

import lombok.Data;

@Data
public class BoardSelPage {
    private Long iboard;
    private Long iuser;
    private int page;
    private int row;
    private int startidx;
}
