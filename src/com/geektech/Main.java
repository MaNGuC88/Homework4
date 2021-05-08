package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Boss thanos = new Boss(2000, 100, "Super Armour");
        System.out.println("Thanos' health = " + thanos.getHealth() + ", damage = " + thanos.getDamage() +
                ", defence type is " + thanos.getDefenceType());

    }

}
