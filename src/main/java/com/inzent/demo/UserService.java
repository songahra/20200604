package com.inzent.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    // 나이 10살, 가나다 리턴

    public UserDO getUser(){
        UserDO userDO = new UserDO(10, "가나다");
        return userDO;
    }

    public UserDO postUser(UserDO userDO){
     
        return userDO;
    }
}