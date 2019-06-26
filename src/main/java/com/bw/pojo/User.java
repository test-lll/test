package com.bw.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private int uid;
    private String uname;
    private String pwd;
    private Date date;

}
