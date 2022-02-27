package com.rc.LearnSpringFrameworkApplication.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Inside MarioGame UP method");
    }

    public void down(){
        System.out.println("Inside MarioGame DOWN method");
    }

    public void left(){
        System.out.println("Inside MarioGame LEFT method");
    }

    public void right(){
        System.out.println("Inside MarioGame RIGHT method");
    }
}
