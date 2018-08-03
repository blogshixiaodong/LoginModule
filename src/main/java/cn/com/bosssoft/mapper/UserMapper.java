package cn.com.bosssoft.mapper;

import cn.com.bosssoft.model.User;

import java.io.IOException;
import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/8/1 16:15
 */
public interface UserMapper {

    List<User> selectUserList() throws IOException;

    User selectUserById(Integer userId) throws IOException;

    User insertUser(User user) throws IOException;

}
