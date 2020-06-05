package com.inzent.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.inzent.demo.DbConnector;


@RestController
@RequestMapping("/api/test")
public class Controller {

    @Autowired
    DbConnector dbconnector;

    @Autowired
    UserService userService;

    @GetMapping(value = "test")
    public UserDO test(){
        return userService.getUser();
    }
    
   @PostMapping(value = "test2")
    public UserDO test2(@RequestBody UserDO userDO){
        return userService.postUser(userDO);
    }
        
    @GetMapping(value = "create")
    public String create() throws Exception {
        dbconnector.createTable();
        return "finish";
    }
    

}
