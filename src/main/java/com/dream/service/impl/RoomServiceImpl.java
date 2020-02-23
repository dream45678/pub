package com.dream.service.impl;

import com.dream.dao.RoomDao;
import com.dream.entity.Room;
import com.dream.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author dream
 * Date  2020-02-23
 */
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomDao roomDao;
    
    @Override
    public Room get(String id){
        return roomDao.get(id);
    }
    
    @Override
    public List<Room> findList(Room room) {
        return roomDao.findList(room);
    }
    
    @Override
    public List<Room> findAllList() {
        return roomDao.findAllList();
    }
    
    @Override
    public int insert(Room room) {
        return roomDao.insert(room);
    }
    
    @Override
    public int insertBatch(List<Room> rooms){
        return roomDao.insertBatch(rooms);
    }
    
    @Override
    public int update(Room room) {
        return roomDao.update(room);
    }
    
    @Override
    public int delete(Room room) {
        return roomDao.delete(room);
    }

}
