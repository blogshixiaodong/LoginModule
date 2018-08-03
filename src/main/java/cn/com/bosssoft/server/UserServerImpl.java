package cn.com.bosssoft.server;

import cn.com.bosssoft.mapper.UserMapper;
import cn.com.bosssoft.model.User;
import cn.com.bosssoft.server.impl.UserServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:31
 */
@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer userId) {
        User user = null;
        try {
            user = userMapper.selectUserById(userId);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }

}


