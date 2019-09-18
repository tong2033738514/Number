package edu.xalead;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //创建工厂
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServlet servlet = (UserServlet) factory.getBean("userServlet");
        UserServlet servlet1 = (UserServlet) factory.getBean("userServlet");
        System.out.println(servlet == servlet1);
        servlet.findUser();
    }
}
