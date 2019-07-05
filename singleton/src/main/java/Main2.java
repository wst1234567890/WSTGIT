import com.sun.org.apache.bcel.internal.generic.NEW;

import java.sql.SQLOutput;

/**
 * @ClassName: Main2
 * @PackAgeName: PACKAGE_NAME
 * @Author: WST
 * @Date: 2019/6/28  16:10
 * @VerSion: 1.0
 **/
public class Main2 {
    public static void main(String[] args) {
        System.out.println(SingleTon2.getInstance()==SingleTon2.getInstance());
    }
}
class SingleTon2{//静态内部类

    private SingleTon2(){}//构造方法私有化

    private static class SingleTon2Instance{//因为内部类只有在使用的时候才会加载，所以，既可以延时加载，又保证线程安全
        private  static final SingleTon2 singleTon2=new SingleTon2();
    }

    public static SingleTon2 getInstance(){//提供公共的访问方法
        return SingleTon2Instance.singleTon2;
    }
}
