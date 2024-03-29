package com.test.entity;

/**
 * @ClassName: Map
 * @PackAgeName: com.test.entity
 * @Author: WST
 * @Date: 2019/7/4  13:23
 * @VerSion: 1.0
 **/
public class Map {
    private  DefenseTower defenseTower;//防御塔
    private  Road road;//路
    private  Tree tree;//树
    private  Monster monster;//野怪
    private  String music;//bgm
    private  String px;//像素

    @Override
    public String toString() {
        return "Map{" +
                "defenseTower=" + defenseTower +
                ", road=" + road +
                ", tree=" + tree +
                ", monster=" + monster +
                ", music='" + music + '\'' +
                ", px='" + px + '\'' +
                '}';
    }

    public DefenseTower getDefenseTower() {
        return defenseTower;
    }

    public void setDefenseTower(DefenseTower defenseTower) {
        this.defenseTower = defenseTower;
    }

    public Road getRoad() {
        return road;
    }

    public void setRoad(Road road) {
        this.road = road;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getPx() {
        return px;
    }

    public void setPx(String px) {
        this.px = px;
    }

    public Map() {
    }
}
