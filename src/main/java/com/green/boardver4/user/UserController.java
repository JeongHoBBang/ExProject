package com.green.boardver4.user;

import com.green.boardver4.BoardVer4Application;
import com.green.boardver4.user.model.UserDel;
import com.green.boardver4.user.model.UserDto;
import com.green.boardver4.user.model.UserUpdDto;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    @Autowired

    public UserController(UserService service) {
        this.service = service;
    }
    @PostMapping
    public int insUser(@RequestBody UserDto dto){
        return service.insUser(dto);
    }
    @PutMapping
    public int updUser(@RequestBody UserUpdDto dto){
        return service.updUser(dto);
    }
}
