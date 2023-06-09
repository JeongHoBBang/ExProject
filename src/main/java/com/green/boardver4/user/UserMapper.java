package com.green.boardver4.user;

import com.green.boardver4.user.model.UserDel;
import com.green.boardver4.user.model.UserDto;
import com.green.boardver4.user.model.UserUpdDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserDto dto);
    int updUser(UserUpdDto dto);
    int delUser(UserDel del);
}
