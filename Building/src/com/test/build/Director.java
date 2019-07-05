package com.test.build;

import com.test.entity.Map;
import com.test.resources.Resources;

/**
 * @ClassName: Director
 * @PackAgeName: com.test.build
 * @Author: WST
 * @Date: 2019/7/4  13:33
 * @VerSion: 1.0
 **/
public class Director {//建造者类，执行地图的各种元素构建，组装，生成地图
    //创建地图的接口并实现
    private Build build = new CreateMap();
    //模拟用户下载地图
    private Resources resources = new Resources();
    //开始构建地图
    public Map createMap(String px,boolean ishasMusic){
        build.buildDefenseTower(resources.getDefenseTower())
                .buildMonster(resources.getMonster())
                .buildRoad(resources.getRoad())
                .buildTree(resources.getTree())
                .buildPx(px)
                .buildMusic(ishasMusic==true?"加载音乐":"不加载音乐");
        return build.getMap();
    }
}
