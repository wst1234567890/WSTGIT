package com.guancz.impl;

/**
 * @ClassName: Main
 * @PackAgeName: com.guancz.impl
 * @Author: WST
 * @Date: 2019/7/3  16:22
 * @VerSion: 1.0
 **/
public class Main {
    public static void main(String[] args) {
        ServerManager sm= new ServerManager();
        BObserver bObserver = new BObserver(sm);//观察者b
        AObserver aObserver = new AObserver(sm);//观察者a
        sm.chenged();//调用被观察者的方法
    }
}
