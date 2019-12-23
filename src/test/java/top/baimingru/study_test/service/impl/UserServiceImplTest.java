package top.baimingru.study_test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.baimingru.study_test.bean.User;
import top.baimingru.study_test.mapper.UserMapper;
import top.baimingru.study_test.service.IUserService;

import javax.annotation.security.RunAs;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bmr
 * @time 2019-12-21 15:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private IUserService userService;


    @Test
    public void getAllUsers(){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.select("id","member_id","nick").le("id",20);
        IPage<User> page=new Page<>(1,8);
        page=userMapper.selectPage(page,queryWrapper);
        List<User> user_list= page.getRecords();
        for (User user:user_list) {
            System.out.println(user);
        }
    }

}