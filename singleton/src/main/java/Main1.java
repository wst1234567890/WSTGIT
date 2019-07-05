import java.sql.SQLOutput;

/**
 * @ClassName: Main1
 * @PackAgeName: PACKAGE_NAME
 * @Author: WST
 * @Date: 2019/6/28  15:08
 * @VerSion: 1.0
 **/
public class Main1 {
    public static void main(String[] args) {
        System.out.println(SingleTone1.getSingleTon1()==SingleTone1.getSingleTon1());
    }
}
class SingleTone1{
    //构造方法私有化
    private SingleTone1() {
    }
    //饿汉模式，由jvm给静态常量赋值，创建唯一实例，可能造成资源浪费
    private static final SingleTone1 singleTon = new SingleTone1();
    //提供暴露的方法
    public static SingleTone1 getSingleTon1(){
        return singleTon;
    }

}