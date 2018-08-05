package cn.com.bosssoft.server;

import cn.com.bosssoft.model.Account;
import cn.com.bosssoft.model.User;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:33
 */

public interface AccountServer {
    /*
    * @Description:
    * @param :  [account, user]
    * @return : void
    */
    void insertAccount(Account account, User user);

    Boolean loginCheck(Account account);

}
