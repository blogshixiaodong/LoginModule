package cn.com.bosssoft.server;

import cn.com.bosssoft.model.PageContainer;
import cn.com.bosssoft.model.User;

import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:30
 */
public interface UserServer {

    User getUserById(Integer userId);

    PageContainer<User> getUserList(PageContainer<User> pageContainer);

}
