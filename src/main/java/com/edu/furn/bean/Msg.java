package com.edu.furn.bean;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vercen
 * @version 1.0
 * @date 2023/3/21 15:09
 */
@Component
public class Msg {
    private int code;
    private String msg;
    private Map<String,Object> map= new HashMap<>();

    public static Msg success(){
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg("success");
        return msg;
    }

    public static Msg fail(){
        Msg msg = new Msg();
        msg.setCode(400);
        msg.setMsg("fail");
        return msg;
    }

    public Msg add(String key,Object value){
        map.put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
