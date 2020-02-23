package com.dream.service.impl;

import com.dream.dao.UsersDao;
import com.dream.entity.Users;
import com.dream.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author dream
 * Date  2020-02-23
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;
    
    @Override
    public Users get(String id){
        return usersDao.get(id);
    }
    
    @Override
    public List<Users> findList(Users users) {
        return usersDao.findList(users);
    }
    
    @Override
    public List<Users> findAllList() {
        return usersDao.findAllList();
    }
    
    @Override
    public int insert(Users users) {
        return usersDao.insert(users);
    }
    
    @Override
    public int insertBatch(List<Users> userss){
        return usersDao.insertBatch(userss);
    }
    
    @Override
    public int update(Users users) {
        return usersDao.update(users);
    }
    
    @Override
    public int delete(Users users) {
        return usersDao.delete(users);
    }

}
