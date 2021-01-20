package edu.xalead;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        //创建工厂
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过静态工厂方法创建实例
        User u = (User)factory.getBean("factory1");
        System.out.println(u);

        //调用非静态工厂方法（必须先创建实例）
        User u1 = (User)factory.getBean("myBean");
        System.out.println(u1);

    }
}
