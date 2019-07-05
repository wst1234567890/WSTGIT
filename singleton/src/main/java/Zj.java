import com.sun.org.apache.bcel.internal.generic.NEW;

import java.sql.SQLOutput;

/**
 * @ClassName: Zj
 * @PackAgeName: PACKAGE_NAME
 * @Author: WST
 * @Date: 2019/6/28  16:37
 * @VerSion: 1.0
 **/
public class Zj {
    /**
     *  总结：单例模式，保证在整个程序运行过程中只有一个对象
     *      一、从实现步骤上分三步：
     *          1、构造方法私有化
     *          2、对外提供获取实例的方法
     *          3、在类的内部创建该类的对象，同过2的方法返回。
     *      二、单例模式的应用场景
     *          1、资源共享的情况下，避免由于频繁的new对象而占用内存空间，如日志文件，应用配置，
     *          2、创建对象时耗时过多或者耗资源过多，但又经常用到的对象，
     *          3、频繁访问 IO 资源的对象，例如数据库连接池或访问本地文件。
     */

}
