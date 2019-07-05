package com.test.build;

import com.test.entity.*;

/**
 * @ClassName: CreateMap
 * @PackAgeName: com.test.build
 * @Author: WST
 * @Date: 2019/7/4  13:16
 * @VerSion: 1.0
 **/
public class CreateMap implements  Build{
    private com.test.entity.Map map = new com.test.entity.Map();
    @Override
    public CreateMap buildDefenseTower(DefenseTower defenseTower) {
        map.setDefenseTower(defenseTower);
        return this;
    }

    @Override
    public CreateMap buildRoad(Road road) {
        map.setRoad(road);
        return this;
    }

    @Override
    public CreateMap buildTree(Tree tree) {
        map.setTree(tree);
        return this;
    }

    @Override
    public CreateMap buildMonster(Monster monster) {
        map.setMonster(monster);
        return this;
    }

    @Override
    public CreateMap buildMusic(String music) {
        map.setMusic(music);
        return this;
    }

    @Override
    public CreateMap buildPx(String px) {
        map.setPx(px);
        return this;
    }

    @Override
    public Map getMap() {
        return map;
    }
}
