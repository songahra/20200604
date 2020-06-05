package com.inzent.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    

    public UserDO getUser(){
        // 나이 10살, 가나다 리턴
        UserDO userDO = new UserDO(10, "가나다");
        return userDO;
    }

    // test2
     public UserDO postUser(){
        UserDO userDO = new UserDO(10, "가나다");
        return userDO;
    }

    // test3 - select 
    public UserDO getUserInfo(int age, String name){
        UserDO userDO = new UserDO(age, name);

        return userDO.getUserInfo;
    }
}