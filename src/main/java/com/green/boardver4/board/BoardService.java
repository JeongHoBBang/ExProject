package com.green.boardver4.board;

import com.green.boardver4.Tag.TagMapper;
import com.green.boardver4.Tag.model.TagVo;
import com.green.boardver4.board.BoardMapper;
import com.green.boardver4.board.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper mapper;
    private final TagMapper tagMapper;
    @Autowired

    public BoardService(BoardMapper mapper,TagMapper tagMapper) {
        this.mapper = mapper;
        this.tagMapper=tagMapper;
    }
    public int insBoard(BoardDto dto){
        return mapper.insBoard(dto);
    }
    public int updBoard(BoardUpdDto dto){
        return mapper.updBoard(dto);
    }
    public List<BoardPageDto> pageBoard(BoardSelPage page){
        int num = page.getPage()-1;
        page.setStartidx(num*page.getRow());
        return mapper.pageBoard(page);
    }
    public BoardDetailVo deBoard(BoardDetailDto dto){
        BoardVo2 boardDetailVos = mapper.deBoard(dto);
        List<TagVo> tagVos = tagMapper.selTag(dto);
        BoardDetailVo build = BoardDetailVo.builder().tag(tagVos).board(boardDetailVos).build();
        return build;
    }

}
