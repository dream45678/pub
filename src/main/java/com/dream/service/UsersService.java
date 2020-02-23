package com.dream.service;

import com.dream.entity.Users;

import java.util.List;

/**
 * Author dream
 * Date  2020-02-23
 */
public interface UsersService {

    public Users get(String id);

    public List<Users> findList(Users users);

    public List<Users> findAllList();

    public int insert(Users users);

    public int insertBatch(List<Users> userss);

    public int update(Users users);

    public int delete(Users users);

}
