package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Boss thanos = new Boss(2000, 100, "Super Armour");
        System.out.println("Thanos' health = " + thanos.getHealth() + ", damage = " + thanos.getDamage() +
                ", defence type is " + thanos.getDefenceType());

        for (Hero hero : createHeroes()) {
            System.out.println(hero.getName() + "'s health = " + hero.getHealth() + ", damage = " + hero.getDamage() +
                     ", Super Power is" + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero captainAmerica = new Hero ("Captain America", 230, 20, "Lightning");
        Hero ironMan = new Hero("Iron Man", 290, 30);
        Hero blackPanther = new Hero("Black Panther", 310, 40, "Vebranium Costume");
        Hero[] heroesTeam = {captainAmerica, ironMan, blackPanther};
        return heroesTeam;
    }
}

