package com.dream.controller;

import com.dream.entity.Room;
import com.dream.service.RoomService;
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
public class RoomController {
    @Autowired
    private RoomService roomService;

    @RequestMapping(value = {"/roomlist"}, method = RequestMethod.GET)
    public Object list() {
        List<Room> rooms = roomService.findAllList();
        return rooms;
    }

    @RequestMapping(value = {"/roomget"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Room room = roomService.get(id);
        return room;
    }

    @RequestMapping(value = "/roominsert", method = RequestMethod.POST)
    public String insert(@RequestBody Room room) {
        if (roomService.insert(room) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/roominsertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Room> rooms) {
        if (roomService.insertBatch(rooms) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/roomupdate", method = RequestMethod.POST)
    public String update(@RequestBody Room room) {
        if (roomService.update(room) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/roomdelete", method = RequestMethod.POST)
    public String delete(@RequestBody Room room) {
        if (roomService.delete(room) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
