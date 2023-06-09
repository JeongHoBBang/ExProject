package com.green.boardver4.Tag;

import com.green.boardver4.Tag.model.TagInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {
    private final TagMapper mapper;
    @Autowired

    public TagService(TagMapper mapper) {
        this.mapper = mapper;
    }
    public int insTag(TagInsDto dto){
        return mapper.insTag(dto);
    }
}
