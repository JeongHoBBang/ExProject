package com.green.boardver4.board;

import com.green.boardver4.board.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;
    @Autowired

    public BoardController(BoardService service) {
        this.service = service;
    }
    @PostMapping
    public int insBoard(@RequestBody BoardDto dto){
        return service.insBoard(dto);
    }
    @PutMapping
    public int updBoard(@RequestBody BoardUpdDto dto){
        return service.updBoard(dto);
    }
//    @GetMapping
//    public List<BoardVo> selBoard(BoardVo vo){
//        return service.selBoard(vo);
//    }
    @GetMapping
    public List<BoardPageDto> pageBoard(@RequestParam (defaultValue = "1")int page, @RequestParam (defaultValue = "40") int row,@RequestParam Long iuser){
        BoardSelPage page1 = new BoardSelPage();
        page1.setPage(page);
        page1.setRow(row);
        page1.setIuser(iuser);
        return service.pageBoard(page1);
    }
    @GetMapping("/{iboard}")
    public BoardDetailVo deBoard(@PathVariable Long iboard,@RequestParam Long iuser){
        BoardDetailDto dto = new BoardDetailDto();
        dto.setIboard(iboard);
        dto.setIuser(iuser);
        return service.deBoard(dto);
    }
}
