package com.test.entity;

/**
 * @ClassName: DefenseTower
 * @PackAgeName: com.test.entity
 * @Author: WST
 * @Date: 2019/7/4  10:01
 * @VerSion: 1.0
 **/
public class DefenseTower {//防御塔类
    private  int size;//防御塔尺寸
    private  int x;//防御塔x坐标
    private  int y;//防御塔y坐标
    private  int power;//防御塔攻击力
    private  int defenseValue;//防御塔防御力

    @Override
    public String toString() {
        return "DefenseTower{" +
                "size=" + size +
                ", x=" + x +
                ", y=" + y +
                ", power=" + power +
                ", defenseValue=" + defenseValue +
                '}';
    }

    public DefenseTower() {
    }

    public DefenseTower(int size, int x, int y, int power, int defenseValue) {
        this.size = size;
        this.x = x;
        this.y = y;
        this.power = power;
        this.defenseValue = defenseValue;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }
}
