package com.dream.controller;

import com.dream.entity.Record;
import com.dream.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author dream
 * Date  2020-02-23
 */
@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;

    @RequestMapping(value = {"/recordlist", ""}, method = RequestMethod.GET)
    public Object list() {
        List<Record> records = recordService.findAllList();
        return records;
    }

    @RequestMapping(value = {"/recordget"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Record record = recordService.get(id);
        return record;
    }

    @RequestMapping(value = "/recordinsert", method = RequestMethod.POST)
    public String insert(@RequestBody Record record) {
        if (recordService.insert(record) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/recordinsertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Record> records) {
        if (recordService.insertBatch(records) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/recordupdate", method = RequestMethod.POST)
    public String update(@RequestBody Record record) {
        if (recordService.update(record) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/recorddelete", method = RequestMethod.POST)
    public String delete(@RequestBody Record record) {
        if (recordService.delete(record) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
