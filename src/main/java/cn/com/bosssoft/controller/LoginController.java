package cn.com.bosssoft.controller;

import cn.com.bosssoft.model.Account;
import cn.com.bosssoft.server.AccountServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:06
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping("/login")
    public String login(Account account) {
        boolean loginResult = accountServer.loginCheck(account);
        if(loginResult) {
            return "redirect: ../user_list.jsp";
        }
        return "redirect: error.jsp";
    }



}
