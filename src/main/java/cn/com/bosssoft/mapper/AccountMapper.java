package cn.com.bosssoft.mapper;

import cn.com.bosssoft.model.Account;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:10
 */
public interface AccountMapper {

    /*
    * @Description:添加账户
    * @param :  [account]
    * @return : void
    */
    void insertAccount(Account account);

    Account selectAccountById(Integer accountId);

}
