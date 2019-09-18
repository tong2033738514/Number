package edu.xalead;

public class FactoryBean {
    /**
     * 非静态方法(实例方法)
     * @return
     */
    public User createUser(){
        return new User();
    }

    /**
     * 静态方法
     * @return
     */
    public static User createStaticUser(){
        User u = new User(1000,"张三",22,"男",null,null,null,null,null);
        return u;
    }
}
