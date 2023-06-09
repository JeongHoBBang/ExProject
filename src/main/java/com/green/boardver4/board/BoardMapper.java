package com.green.boardver4.board;

import com.green.boardver4.board.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardDto dto);
    int updBoard(BoardUpdDto dto);
    List<BoardPageDto> pageBoard(BoardSelPage page);
    BoardVo2 deBoard(BoardDetailDto dto);
}
