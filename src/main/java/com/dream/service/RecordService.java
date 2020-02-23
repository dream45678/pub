package com.dream.service;

import com.dream.entity.Record;

import java.util.List;

/**
 * Author dream
 * Date  2020-02-23
 */
public interface RecordService {

    public Record get(String id);

    public List<Record> findList(Record record);

    public List<Record> findAllList();

    public int insert(Record record);

    public int insertBatch(List<Record> records);

    public int update(Record record);

    public int delete(Record record);

}
