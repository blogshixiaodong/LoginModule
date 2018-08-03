package cn.com.bosssoft.server;

import cn.com.bosssoft.mapper.AccountMapper;
import cn.com.bosssoft.server.impl.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:33
 */
public class AccountServerImpl implements AccountServer {

    @Autowired
    private AccountMapper accountMapper;


}
