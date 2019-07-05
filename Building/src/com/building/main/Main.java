package com.building.main;

import com.test.build.Director;
import com.test.entity.Map;

/**
 * @ClassName: Main
 * @PackAgeName: com.building.main
 * @Author: WST
 * @Date: 2019/7/4  9:49
 * @VerSion: 1.0
 **/
public class Main {
    //建造者模式

    /**
     * 一、建造者模式的几个成员：
     * Builder：构建者接口，定义各部件生成的方法；
     * ConcreteBuilder：具体构建者类：实现Builder构建者接口，具体定义如何生成各个部件；依赖于Product成品类，其中还有获取成品组装结构的方法GetResult()方法；
     * Product：成品类
     * Director：控制者类，这是控制整个组合过程，在这个类内部有个Construct()方法，这个方法的作用就是通过调用Builder内部的各个组件的生成方法来完成组装；
     *
     * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
     * 二、实例：模拟用户下载游戏地图？
     *     步骤：
     *              1、我需要一个地图，所以要有一个地图对象Map， product
     *              2、地图中的每一个元素都是一个对象，
     *              3、需要动态的给地图中的元素赋值，当然要抽象出地图的所有共性的接口， Build
     *              4、Build的impl就是具体的建造者，  ConcreteBuilder
     *              5、接口有了，impl有了，需要一个具体的控制者将这些对象整合起来， Director
     *三、实际应用场景？
     *
     * @param args
     */
    public static void main(String[] args) {
        //首先要有一个建造者,再游戏中也许会是一个按钮
        Director director = new Director();
        //来个高品质的，并且加音乐
        Map map= director.createMap("100%",true);
        System.out.println(map);
        //中品质的画面
        Map map1 = director.createMap("50%",true);
        System.out.println(map1);
        //xp电脑
        Map map2 = director.createMap("25%",false);
        System.out.println(map2);
    }
}
