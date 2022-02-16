package com.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.entity.users;

import java.util.List;


@Mapper
public interface TestUserMapper {

    List<users> usersList();
}
