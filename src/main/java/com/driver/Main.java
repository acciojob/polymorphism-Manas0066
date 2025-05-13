package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {
   static class Product{
       public int product(int x, int y) {
           return x * y;
       }
       public int product(int x, int y, int z) {
           return x*y*z;
       }
       public double product(double x, double y) {
           return x*y;
       }
   }
    //dsa
    public static void main(String[] args) {
        Product p = new Product();
        int ans1 = p.product(2,3);

        int ans2 = p.product(2,3,4);

        double ans3 = p.product(2.34,1.22);

        System.out.println(ans1+" "+ans2+" "+" "+ans3);
    }

}