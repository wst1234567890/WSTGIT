package com.test.entity;

/**
 * @ClassName: Road
 * @PackAgeName: com.test.entity
 * @Author: WST
 * @Date: 2019/7/4  10:06
 * @VerSion: 1.0
 **/
public class Road {//道路类
    private  int width;//宽度
    private  int length;//长度
    private  int x;//x坐标

    @Override
    public String toString() {
        return "Road{" +
                "width=" + width +
                ", length=" + length +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public Road(int width, int length, int x, int y) {
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public Road() {
    }

    private  int y;//y坐标

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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
