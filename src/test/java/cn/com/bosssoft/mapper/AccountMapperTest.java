package cn.com.bosssoft.mapper;

import cn.com.bosssoft.model.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: jiangjaimin
 * @date :  2018/8/3.
 */
public class AccountMapperTest {

    private ApplicationContext context;
    @Before
    public void before(){
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void testInsertAccount() throws Exception {
        AccountMapper accountMapper = context.getBean(AccountMapper.class);
        Account account = new Account();
        account.setAccountId(1);
        account.setPassword("123");
        account.setUserId(1);
        accountMapper.insertAccount(account);
    }
}