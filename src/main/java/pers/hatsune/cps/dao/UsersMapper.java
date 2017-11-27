package pers.hatsune.cps.dao;


import org.apache.ibatis.annotations.*;
import pers.hatsune.cps.domain.Users;

@Mapper
public interface UsersMapper {

    @Select("SELECT * FROM users where id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password")
    })
    Users findById(@Param("id") Long id);
}