package cn.com.bosssoft.dao;

import cn.com.bosssoft.model.User;

import java.io.IOException;
import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/8/1 16:15
 */
public interface UserMapper {

    List<User> selectUserList() throws IOException;

    User selectUserByUsername(String username);

    User insertUser(User user);


}
