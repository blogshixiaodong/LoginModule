package cn.com.bosssoft.mapper;

import cn.com.bosssoft.model.Account;
import cn.com.bosssoft.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: jiangjaimin
 * @date :  2018/8/3.
 */
public class UserMapperTest {

    private ApplicationContext context;
    @Before
    public void before(){
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void testInsertAccount() throws Exception {
        UserMapper accountMapper = context.getBean(UserMapper.class);
        User user = new User();
        user.setUsername("marry");
        user.setAddress("fjut");
        user.setGender("男");
        Integer gg = accountMapper.insertUser(user);
        System.out.println(user.getUserId());
    }
}