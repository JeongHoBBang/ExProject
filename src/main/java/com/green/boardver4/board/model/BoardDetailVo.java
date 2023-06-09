package com.green.boardver4.board.model;

import com.green.boardver4.Tag.model.TagVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BoardDetailVo {
    private BoardVo2 board;
    private List<TagVo> tag;
}