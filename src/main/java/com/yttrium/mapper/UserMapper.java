package com.yttrium.mapper;

import com.yttrium.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User selectByLogin(User user);
	
	User selectByEmail(String userEmail);
}