package com.factory.simpleFactory;

/**
 * @ClassName: Main
 * @PackAgeName: com.factory.simpleFactory
 * @Author: WST
 * @Date: 2019/7/2  13:38
 * @VerSion: 1.0
 **/
public class Main {
    /**
     * 简单的工厂模式实现，
     * 由工厂去判断需要生成的对象
     * 若是需要生产ProdductC，那么就需要修改Factory，扩展性差
     * @param args
     */
    public static void main(String[] args) {
        IProduct iProduct = ProductFactory.creatProduct("A");
        try {
            iProduct.getProduct();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}

//简单工厂
interface IProduct {//一个api，抽象出实现类中的公共方法
    void getProduct();
}

class ProductA implements IProduct{//实现类A

    @Override
    public void getProduct() {
        System.out.println("产品A的实例");
    }
}

class ProductB implements IProduct{

    @Override
    public void getProduct() {
        System.out.println("产品B的实例");
    }
}

class ProductFactory{//工厂类
    private static IProduct iProduct;
    public static IProduct creatProduct(String s)  {
        switch (s) {
            case "A":
                return iProduct = new ProductA();

            case "B":
                return iProduct = new ProductB();

            default:
                System.out.println("无product实例");
                break;
        }

            return iProduct;

    }
}

