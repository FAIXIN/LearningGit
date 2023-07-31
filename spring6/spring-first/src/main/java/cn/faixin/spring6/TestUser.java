package cn.faixin.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUserObject(){
        //加载Spring配置文件
        ApplicationContext conntext = new ClassPathXmlApplicationContext("bean.xml");
        //获取创建对象
        User user = (User) conntext.getBean("user");
        //调用对象方法及进行测试
        user.add();
    }
}
