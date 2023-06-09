package com.green.boardver4.user;

import com.green.boardver4.user.model.UserDel;
import com.green.boardver4.user.model.UserDto;
import com.green.boardver4.user.model.UserUpdDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper mapper;
    @Autowired

    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }
    public int insUser(UserDto dto){
        return mapper.insUser(dto);
    }
    public int updUser(UserUpdDto dto){
        return mapper.updUser(dto);
    }
}

