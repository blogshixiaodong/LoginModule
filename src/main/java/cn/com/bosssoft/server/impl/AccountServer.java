package cn.com.bosssoft.server.impl;

import cn.com.bosssoft.model.Account;
import org.springframework.stereotype.Service;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:33
 */

public interface AccountServer {

    Boolean loginCheck(Account account);

}
