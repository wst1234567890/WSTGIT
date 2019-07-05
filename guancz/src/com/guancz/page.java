package com.guancz;

/**
 * @ClassName: page
 * @PackAgeName: com.guancz
 * @Author: WST
 * @Date: 2019/7/3  15:34
 * @VerSion: 1.0
 **/
public class page {
    /**
     * 定义对象之间的一种一对多的依赖关系，让多个观察者同时监听某一个被观察者对象，当被观察的对象状态发生改变的时候
     * 所有观察者收到被更新状态。
     * eg：
     *      需求：气象局发布天气预报，学生和上班族根据天气做出相关反应
     *
     *     一、设计被观察者：气象局,内部维护一个{“晴天”，“下雨”，“雾霾”，“冰雹”，“狂风”，“爆雪”}
     *         气象局要不断的更新天气，学生与上班族能实时收到数据
     *     二、被观察者需要继承util.Observable类
     *         观察者需要实现Observer类重写其update方法
     *     三、
     */
}
