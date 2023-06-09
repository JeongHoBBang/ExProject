package com.green.boardver4.Tag;

import com.green.boardver4.Tag.model.TagInsDto;
import com.green.boardver4.Tag.model.TagVo;
import com.green.boardver4.board.model.BoardDetailDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagMapper {
    int insTag(TagInsDto dto);
    List<TagVo> selTag(BoardDetailDto dto);
}
