package com.ted.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int id;
    private String username;
    private String password;
    private String nickname;
    private int money;
    private String address;
    private int state;
    private String setAside1;
    private String setAside2;
    private String setAside3;
}
