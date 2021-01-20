package edu.xalead;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        //创建工厂
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        User u = factory.getBean(User.class);
        System.out.println(u);
    }
}
