package com.inzent.demo;

import com.inzent.domain.AccountDO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    @Autowired
    SqlSession sqlSession;
    //조회
    public AccountDO select(){
        return sqlSession.selectOne("readAccount");
    }
    //등록
    public int insert(AccountDO accountDO){
        return sqlSession.insert("insertAccount", accountDO);
    }
}