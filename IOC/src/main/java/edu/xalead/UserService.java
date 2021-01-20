package edu.xalead;

import lombok.Data;
import lombok.Setter;

@Setter
public class UserService {
    private UserDao userDao=null ;

    public User findUser(){
        return userDao.findUser();
    }
}
