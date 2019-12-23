package top.baimingru.study_test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.baimingru.study_test.bean.User;
import top.baimingru.study_test.mapper.UserMapper;
import top.baimingru.study_test.service.IUserService;

/**
 * @author bmr
 * @time 2019-12-21 15:32
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
