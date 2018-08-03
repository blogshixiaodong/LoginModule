package cn.com.bosssoft.mapper;

import cn.com.bosssoft.model.User;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/8/1 16:15
 */
public interface UserMapper {

    List<User> selectUserList() throws IOException;

    User selectUserById(Integer userId) throws IOException;

    /*
    * @Description: 插入用户信息
    * @param :  [user]
    * @return : Integer
    */
    Integer insertUser(User user) throws IOException;

}
