package com.guancz.impl;

import java.util.Observable;

/**
 * @ClassName: ServerManager
 * @PackAgeName: com.guancz.impl
 * @Author: WST
 * @Date: 2019/7/3  16:00
 * @VerSion: 1.0
 **/
public class ServerManager extends Observable {//被观察者：气象局
    //定义几种天气
    String []arr = {"晴天","下雨","雾霾","12级台风","冰雹"};

    //当天气发生改变时通知多个监听者
    public void chenged(){
        for (int i = 0;i<arr.length;i++){
            setChanged();//只有setChanged方法之后notityObservers（）方法才会生效。
            notifyObservers(arr[i]);//通知所有观察者，并传参数
        }
    }

}
