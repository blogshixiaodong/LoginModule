package cn.com.bosssoft.server;

import cn.com.bosssoft.mapper.AccountMapper;
import cn.com.bosssoft.model.Account;
import cn.com.bosssoft.server.impl.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:33
 */
@Service
public class AccountServerImpl implements AccountServer {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Boolean loginCheck(Account checkAccount) {
        Account account = accountMapper.selectAccountById(checkAccount.getAccountId());
        if(checkAccount.equals(account)) {
            return true;
        }
        return false;
    }
}
