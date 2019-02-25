package com.dyq.jdbc.dao;

import com.dyq.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @program: jdbc
 * @ClassName: UserDAO
 * @description:
 * @author: Dengyq
 * @create: 2019-02-25 10:40
 **/
public interface UserDAO {


    void createUser(String name,Integer age);

    void updateUser(Integer ID,String name,String age);

    void deleteUser(String name);

    User findUser(String name);


}
