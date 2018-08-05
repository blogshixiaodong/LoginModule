package cn.com.bosssoft.controller;

import cn.com.bosssoft.model.Account;
import cn.com.bosssoft.model.User;
import cn.com.bosssoft.server.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: jiangjaimin
 * @date :  2018/8/3.
 */
@Controller
@RequestMapping("/user")
public class registerController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping(value = "/register" )
    public String register(User user, Account account){
        accountServer.insertAccount(account, user);
        return "../index";
    }
}
