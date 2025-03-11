
package com.mycompany.mavenproject22;

public class Mavenproject22 {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(16, 17));
        System.out.println(c.sum(16, 17, 18));
        System.out.println(c.sum(-16.3, -17.3));
        System.out.println(c.sum(20.4, 19.3));
    }
}
