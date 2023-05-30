package com.green.boardver3.user;

import com.green.boardver3.user.model.UserInsEntity;
import com.green.boardver3.user.model.UserLoginDto;
import com.green.boardver3.user.model.UserLoginVo;
import com.green.boardver3.user.model.UserUpdPwDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsEntity entity);
    UserLoginVo selUserByUid(UserLoginDto dto);
    int updPw (UserUpdPwDto dto);
}
