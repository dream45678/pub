package com.dream.service.impl;

import com.dream.dao.RecordDao;
import com.dream.entity.Record;
import com.dream.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author dream
 * Date  2020-02-23
 */
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;
    
    @Override
    public Record get(String id){
        return recordDao.get(id);
    }
    
    @Override
    public List<Record> findList(Record record) {
        return recordDao.findList(record);
    }
    
    @Override
    public List<Record> findAllList() {
        return recordDao.findAllList();
    }
    
    @Override
    public int insert(Record record) {
        return recordDao.insert(record);
    }
    
    @Override
    public int insertBatch(List<Record> records){
        return recordDao.insertBatch(records);
    }
    
    @Override
    public int update(Record record) {
        return recordDao.update(record);
    }
    
    @Override
    public int delete(Record record) {
        return recordDao.delete(record);
    }

}
