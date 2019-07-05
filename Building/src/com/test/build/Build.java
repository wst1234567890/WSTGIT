package com.test.build;

import com.test.entity.*;


/**
 * @ClassName: Build
 * @PackAgeName: com.test.build
 * @Author: WST
 * @Date: 2019/7/413:05
 * @VerSion: 1.0
 **/
public interface Build {//建造者的接口
    Build buildDefenseTower(DefenseTower defenseTower);//建造防御塔
    Build buildRoad(Road road);//建造路
    Build buildTree(Tree tree);//建造树
    Build buildMonster(Monster monster);//建造野怪
    Build buildMusic(String music);//构建背景音乐
    Build buildPx(String px);//构建像素
    Map getMap();//构建地图

}
