package com.dyq.jdbc.dao;

import com.dyq.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @program: jdbc
 * @ClassName: UserDAOImpl
 * @description:
 * @author: Dengyq
 * @create: 2019-02-25 10:44
 **/
@Repository
public class UserDAOImpl implements  UserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 通过update插入数据
     * 通过update修改数据
     * 通过update删除数据
     **/

    @Override
    public void createUser(String name, Integer age) {
        jdbcTemplate.update("insert into users(name,age) values (?,?)",name,age);
    }

    @Override
    public void updateUser(Integer ID,String name,String age) {
        jdbcTemplate.update("update users set name=?,age=? where ID=? ",name,age,ID);
    }

    @Override
    public void deleteUser(String name) {
        jdbcTemplate.update("delete from users where name ='"+name+"'");
    }

    @Override
    public User findUser(String name) {
        String sql="select ID,name,age from users where name =?";
        RowMapper<User> rowMapper=new BeanPropertyRowMapper<User>(User.class);
        User user= jdbcTemplate.queryForObject(sql, rowMapper,name);
        return user;
    }
}
