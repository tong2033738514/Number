package edu.xalead;

import lombok.Data;
import lombok.Setter;

@Setter
public class UserDao {
    private String url;
    private String driverClass;
    private String username;
    private String password;

    public User findUser(){
//        Class.forName(driverClass);
        User u = new User(1000,"张三",22,"男",null,null,null,null,null);
        return u;
    }
}
