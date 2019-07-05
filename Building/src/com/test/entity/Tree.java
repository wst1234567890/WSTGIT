package com.test.entity;

/**
 * @ClassName: Tree
 * @PackAgeName: com.test.entity
 * @Author: WST
 * @Date: 2019/7/4  10:07
 * @VerSion: 1.0
 **/
public class Tree {//树类
    private  String color;//颜色
    private  int size;//尺寸
    private  int x;//x坐标
    private  int y;//y坐标

    @Override
    public String toString() {
        return "Tree{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public Tree(String color, int size, int x, int y) {
        this.color = color;
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public Tree() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
}
