package com.spring.week1.introduction.springIntroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    //with class implementation
//    @Autowired
//    private ProdDB db;

    //with interface implemantation
    @Autowired
    private DBIterface db;
    String getData(){
       return db.getData();
    }


}
