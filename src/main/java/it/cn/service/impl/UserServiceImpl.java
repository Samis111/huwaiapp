package it.cn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import it.cn.Strength.VO.User;
import it.cn.service.UserService;
import it.cn.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 16129
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-09-17 10:11:26
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




