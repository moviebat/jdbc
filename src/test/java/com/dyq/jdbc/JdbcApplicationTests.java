package com.dyq.jdbc;

import com.dyq.jdbc.dao.UserDAOImpl;
import com.dyq.jdbc.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcApplicationTests {

    @Autowired
    private UserDAOImpl userDAOImpl;


    @Test
    public void contextLoads() {




    }

    @Test
    public void createUser(){
        userDAOImpl.createUser("dyq",39);
        System.out.println("创建第一个用户");
    }

    @Test
    public void updateUser(){
        userDAOImpl.updateUser(2,"dxy","12");
        System.out.println("修改ID=1的用户");
    }

    @Test
    public void deleteUser(){
        userDAOImpl.deleteUser("dyq");
        System.out.println("删除名为dyq的用户");
    }

    @Test
    public void findUser(){
        User user = userDAOImpl.findUser("dxy");
        System.out.println(user.toString());
    }

    @Test
    public void batchCreateUser(){

    }
}
