import java.util.concurrent.SynchronousQueue;

/**
 * @ClassName: Main
 * @PackAgeName: PACKAGE_NAME
 * @Author: WST
 * @Date: 2019/6/28  14:52
 * @VerSion: 1.0
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(SingleTon.getSingleTon()==SingleTon.getSingleTon());//输出的true，说明是同一个对象
    }
}
class  SingleTon{
    //懒汉模式,延时加载,避免在类加载过程中，避免创建实例没有使用
    private static SingleTon singleTon = null;

    //构造方法私有化
    private SingleTon(){}

    //对外提供公共的实例化方法
    public static  SingleTon getSingleTon(){
        if (singleTon==null)
            synchronized (Object.class) {//多线程模式下，需加同步锁
                if(singleTon==null)
                new SingleTon();
           }
        return singleTon;
    }
}
