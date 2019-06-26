package com.bw.mapper;

import com.bw.pojo.Mysql;
import com.bw.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from tb_user where uname=#{uname} and pwd=#{pwd}")
    User login(User user);
    @Update("update tb_user set date=#{date} where uname=#{uname}")
    void updateDate(User user);
    @Select("select * from tb_mysql")
    List<Mysql> getMysqlList();

}
