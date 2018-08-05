package cn.com.bosssoft.controller;

import cn.com.bosssoft.model.PageContainer;
import cn.com.bosssoft.model.User;
import cn.com.bosssoft.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shixiaodong
 * @date 2018/8/3 23:35
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServer userServer;


    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody ModelAndView userList(PageContainer<User> pageContainer) {
        pageContainer = userServer.getUserList(pageContainer);
        System.out.println(pageContainer);
        Map<String, String> map = new HashMap<>();
        map.put("pageContainer", pageContainer.toJson());
        return new ModelAndView(new MappingJackson2JsonView(), map);
    }

}
