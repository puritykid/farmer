package com.lunz.lunzdataservice.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String userId;

    private String loginName;

    private String password;

}
