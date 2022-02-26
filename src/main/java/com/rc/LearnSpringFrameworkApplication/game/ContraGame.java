package com.rc.LearnSpringFrameworkApplication.game;

public class ContraGame implements GamingConsole {

    @Override
    public void up(){
        System.out.println("Inside ContraGame UP method");
    }

    @Override
    public void down(){
        System.out.println("Inside ContraGame DOWN method");
    }

    @Override
    public void left(){
        System.out.println("Inside ContraGame LEFT method");
    }

    @Override
    public void right(){
        System.out.println("Inside ContraGame RIGHT method");
    }
}
