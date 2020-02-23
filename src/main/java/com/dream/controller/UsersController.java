package com.dream.controller;

import com.dream.entity.Users;
import com.dream.service.UsersService;
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
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = {"/userslist"}, method = RequestMethod.GET)
    public Object list() {
        List<Users> userss = usersService.findAllList();
        return userss;
    }

    @RequestMapping(value = {"/usersget"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Users users = usersService.get(id);
        return users;
    }

    @RequestMapping(value = "/usersinsert", method = RequestMethod.POST)
    public String insert(@RequestBody Users users) {
        if (usersService.insert(users) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/usersinsertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Users> userss) {
        if (usersService.insertBatch(userss) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/usersupdate", method = RequestMethod.POST)
    public String update(@RequestBody Users users) {
        if (usersService.update(users) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/usersdelete", method = RequestMethod.POST)
    public String delete(@RequestBody Users users) {
        if (usersService.delete(users) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
