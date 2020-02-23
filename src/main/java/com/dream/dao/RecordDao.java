package com.dream.dao;

import com.dream.entity.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author dream
 * Date  2020-02-23
 */
@Mapper
public interface RecordDao {

    public Record get(String id);

    public List<Record> findList(Record record);

    public List<Record> findAllList();

    public int insert(Record record);

    public int insertBatch(List<Record> records);

    public int update(Record record);

    public int delete(Record record);

}