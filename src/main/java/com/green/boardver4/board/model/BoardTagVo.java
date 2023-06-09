package com.green.boardver4.board.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardTagVo {
    private Long iuser;
    private Long iboard;
    private String tag;
}
