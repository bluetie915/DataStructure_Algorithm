package com.yicheng.algo.fanxing.demo2;

public class MainClass {
    public static void main(String[] args) {

        // 创建抽奖器，指定数据类型
        ProductGetter<String> stringProductGetter = new ProductGetter<>();
        String[] strProducts = {"手机", "扫地机器人", "咖啡机"};
        // 给抽奖器中填充奖品
        for (int i = 0; i < strProducts.length; i++) {
            stringProductGetter.addProduct(strProducts[i]);
        }

        // 抽奖
        String product1 = stringProductGetter.getProduct();
        System.out.println("恭喜您抽中了：" + product1);

        System.out.println("--------------------");
        ProductGetter<Integer> integerProductGetter = new ProductGetter<>();
        int[] intProduct = {10000, 5000, 3000, 1000};
        for (int i = 0; i < intProduct.length; i++) {
            integerProductGetter.addProduct(intProduct[i]);
        }

        Integer product2 = integerProductGetter.getProduct();
        System.out.println("恭喜您抽中奖金：" + product2 + "元");
    }
}
