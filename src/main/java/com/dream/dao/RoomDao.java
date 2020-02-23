package com.dream.dao;

import com.dream.entity.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author dream
 * Date  2020-02-23
 */
@Mapper
public interface RoomDao {

    public Room get(String id);

    public List<Room> findList(Room room);

    public List<Room> findAllList();

    public int insert(Room room);

    public int insertBatch(List<Room> rooms);

    public int update(Room room);

    public int delete(Room room);

}