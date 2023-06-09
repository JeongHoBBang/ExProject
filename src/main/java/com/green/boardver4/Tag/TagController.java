package com.green.boardver4.Tag;

import com.green.boardver4.Tag.model.TagInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Tag")
public class TagController {
    private final TagService service;
    @Autowired

    public TagController(TagService service) {
        this.service = service;
    }
    @PostMapping
    public int insTag(@RequestBody TagInsDto dto){
        return service.insTag(dto);
    }
}
