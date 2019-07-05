package com.factory.factoryMethod;

/**
 * @ClassName: Main
 * @PackAgeName: com.factory.factoryMethod
 * @Author: WST
 * @Date: 2019/7/2  14:33
 * @VerSion: 1.0
 **/
public class Main {
    /**
     *工厂方法模式，定义了商品的生产接口，但不负责生产商品，由实现工厂去生产对象
     *  此时可以扩展Product，符合开闭原则，但是该工厂只能生产同类型的商品
     * @param args
     */
    public static void main(String[] args) {
       ProductFactory productFactoryA = new ProductFactoryA();
       ProductFactory productFactoryB = new ProductFactoryB();
       productFactoryA.creatProduct().getProduct();//生产商品A的工厂
       productFactoryB.creatProduct().getProduct();//生产商品B的工厂
    }
}

interface Product{//商品接口
     void getProduct();
}

class ProductA implements Product{

    @Override
    public void getProduct() {
        System.out.println("产品A实例");
    }
}

class ProductB implements Product{

    @Override
    public void getProduct() {
        System.out.println("产品B实例");
    }
}

interface ProductFactory{//工厂接口
    Product creatProduct();
}

class ProductFactoryA implements ProductFactory{//生产A商品的工厂
    @Override
    public Product creatProduct() {
        return new ProductA();
    }

}

class ProductFactoryB implements ProductFactory{//生产B商品的工厂
    @Override
    public Product creatProduct() {
        return new ProductB();
        }

}