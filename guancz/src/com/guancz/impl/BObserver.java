package com.guancz.impl;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: AObserver
 * @PackAgeName: com.guancz.impl
 * @Author: WST
 * @Date: 2019/7/3  16:12
 * @VerSion: 1.0
 **/
public class BObserver implements Observer {//观察者A

    public BObserver(ServerManager sm){//被观察者对象
        super();
        sm.addObserver(this);//注册加入观察者
    }

    @Override
    public void update(Observable o, Object arg) {//o是被观察者对象，arg是notifyObservers(arg)中可以传给观察者的对象
        switch (arg.toString()){
            case "晴天":
                System.out.println(o.getClass().getSimpleName()+"通知："+arg+"，方堃🚇上班");
                break;
            case "下雨":
                System.out.println(o.getClass().getSimpleName()+"通知："+arg+"，方堃🏊‍上班");
                break;
            case "雾霾":
                System.out.println(o.getClass().getSimpleName()+"通知："+arg+"，方堃💀上班");
                break;
            case "12级台风":
                System.out.println(o.getClass().getSimpleName()+"通知："+arg+"，方堃✈上班");
                break;
                default:
                    System.out.println(o.getClass().getSimpleName()+"通知："+arg+"，方堃不用下班");
                    break;
        }
    }
}
