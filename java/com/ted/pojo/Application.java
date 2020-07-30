package com.ted.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    private int id;
    private String corpName;
    private String appName;
    private String appKey;
    private String appSecret;
    private String redirectUrl;
    private int linit;
    private String descrpition;
    private int cusId;
    private int state;
    private String setAside1;
    private String setAside2;
    private String setAside3;
}
