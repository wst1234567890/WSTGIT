package com.test.resources;

import com.test.entity.DefenseTower;
import com.test.entity.Monster;
import com.test.entity.Road;
import com.test.entity.Tree;

/**
 * @ClassName: Resources
 * @PackAgeName: com.test.resources
 * @Author: WST
 * @Date: 2019/7/4  10:13
 * @VerSion: 1.0
 **/
public class Resources {//模拟用户下载的地图资源
    //用户下载防御塔
    public DefenseTower getDefenseTower(){
        return  new DefenseTower(12,50,50,100,80);
    }
    //用户下载野怪
    public Monster getMonster(){
        return new Monster(10,60,150,75,40);
    }
    //用户下载道路
    public Road getRoad(){
        return new Road(300,2000,50,50);
    }
    //用户下载树
    public Tree getTree(){
        return  new Tree("绿色",5,20,100);
    }
}
