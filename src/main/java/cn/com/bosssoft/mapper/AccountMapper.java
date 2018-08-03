package cn.com.bosssoft.mapper;

import cn.com.bosssoft.model.Account;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:10
 */
public interface AccountMapper {

    Account selectAccountById(Integer accountId);

}
