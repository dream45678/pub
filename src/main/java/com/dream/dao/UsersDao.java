package com.dream.dao;

import com.dream.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author dream
 * Date  2020-02-23
 */
@Mapper
public interface UsersDao {

    public Users get(String id);

    public List<Users> findList(Users users);

    public List<Users> findAllList();

    public int insert(Users users);

    public int insertBatch(List<Users> userss);

    public int update(Users users);

    public int delete(Users users);

}