package com.inzent.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.inzent.demo.DbConnector;


@RestController
@RequestMapping("/api/test")
public class Controller {

    @Autowired
    DbConnector dbconnector;

    @GetMapping(value = "test")
    public String test(){
        return "hi";
    }

    @GetMapping(value = "create")
    public String create() throws Exception {
        dbconnector.createTable();
        return "finish";
    }
    

}
