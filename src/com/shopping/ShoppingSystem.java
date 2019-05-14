package com.shopping;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ShoppingSystem {



    private static boolean login(){
        Scanner in = new Scanner(System.in);

        for(int i=1; i<=3; i++){
            System.out.println("输入用户名：");
            String username = in.next();
            System.out.println("输入密码：");
            String password = in.next();
            if (username.equals("admin") && password.equals("123")){
                System.out.println("登陆成功！");
                return true;
            }
            System.out.println("用户名或密码错误！请重新输入。还有"+(3-i)+"次机会");
            if (i == 3){
                System.out.println("错误输入次数超过限制，程序结束！");
                return false;
            }
        }
        return false;

    }

    public static void showMenu(){
        System.out.println("菜单：");
        System.out.println("1.商品分类：");
        System.out.println("2.商品上架");
        System.out.println("3.商品下架");
        System.out.println("4.显示商品信息");
        System.out.println("5.购买商品");
        System.out.println("输入菜单选项数字");
    }


    public static Product upProduct(){
        Scanner upProductIn = new Scanner(System.in);
        System.out.println("输入商品ID：");
        int id = upProductIn.nextInt();
        System.out.println("输入商品名称：");
        String name = upProductIn.next();
        System.out.println("输入商品价格：");
        double price = upProductIn.nextDouble();
        System.out.println("输入商品详情：");
        String detail = upProductIn.next();
        System.out.println("输入商品数量：");
        int num = upProductIn.nextInt();
        System.out.println("输入商品类别：");
        String category = upProductIn.next();
        Product product = new Product(id,name,price,detail,num,category);
        return product;
    }

    public static int removeProduct(){
        System.out.println("请输入下架商品ID：");
        Scanner removeIn = new Scanner(System.in);
        return removeIn.nextInt();
    }





    public static void main(String[] args) {
        if (login()){
            showMenu();
            Product p = new Product(1,"phone",5000,"Null",10,"phone");
            ProductList productList = new ProductList();
            productList.addProduct(p);


            Scanner in = new Scanner(System.in);

            boolean isRun = true;
            while (isRun){
                int choice = in.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("分类");
                        Set<String> categorySet = productList.showAllCategory();
                        int i=1;
                        for (String category:categorySet){
                            System.out.println(i + "." + category);
                            i++;
                        }
                        break;
                    case 2:
                        productList.addProduct(upProduct());
                        break;
                    case 3:
                        productList.removeProduct(removeProduct());
                        break;
                    case 4:
                        productList.showProductList();
                        System.out.println("是否要购买商品？y/n");
                        String isBuy = in.next();
                        if (isBuy.equals("y")){
                            System.out.println("输入购买商品ID");
                            int productId = in.nextInt();
                            System.out.println("购买成功！");
                            productList.purchaseProduct(productId);
                        }
                        break;
                    case 5:
                        System.out.println("输入购买商品ID");
                        int productId = in.nextInt();
                        System.out.println("购买成功！");
                        productList.purchaseProduct(productId);
                        break;
                    case 0:
                        System.out.println("退出");
                        isRun = false;
                        break;
                }
                showMenu();
            }

        }

    }
}
