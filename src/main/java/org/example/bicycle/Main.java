package org.example.bicycle;

//1 Отгадайте загадку: с крыльями, но не летает, с цепью,
// но не лает, со спицами, но не вяжет, с седлом, но не скачет, с рамой, но не дует.
//
//2 Создайте класс Велосипед. Типы полей этого класса должны быть объявлены
// как внутренние классы (руль, седло, колесо, передачи, рама и т.д.).
// Каждая часть велосипеда помимо описания характеристик хранит запас прочности.
// Когда запас прочности равен 0, часть велосипеда ломается.

// 3 В основной программе создайте велосипед.
// Велосипед должен ехать и встречать на пути препятствия (яма, бордюр, битое стекло, лужа и т.д.).
// Каждое препятствие уменьшает показатель прочности на случайную величину у случайной части велосипеда.
// Программа выполняется, пока у велосипеда нет сломанных частей.

//4 Напишите JavaDoc для написанных классов и  методов. Одним из способов сгенерируйте документацию.
//

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();

        Bicycle bicycle = new Bicycle();

        Bicycle.Handlebar handlebar = bicycle.new Handlebar(20);
        Bicycle.Saddle saddle = bicycle.new Saddle(20);
        Bicycle.Wheel wheel = bicycle.new Wheel(20);
        Bicycle.Gears gears = bicycle.new Gears(25);
        Bicycle.Frame frame = bicycle.new Frame(15);

        Scanner sc = new Scanner(System.in);

        int durability = Math.min(Math.min(wheel.getDurability(), frame.getDurability()), Math.min(saddle.getDurability(), handlebar.getDurability()));

        while (durability > 1) {
            System.out.print("Bicycle move, type kick: ");
            String damage = sc.nextLine();
            try {
                if (damage.equals("kick")) {
                    int partNumber = rnd.nextInt(1, 6);

                    switch (partNumber) {
                        case 1 -> {
                            frame.getDamage();
                            System.out.println("Frame destability +" + frame.getDurability());
                        }
                        case 2 -> {
                            wheel.getDamage();
                            System.out.println("Wheel destability +" + wheel.getDurability());
                        }
                        case 3 -> {
                            handlebar.getDamage();
                            System.out.println("Handlebar destability +" + handlebar.getDurability());
                            //  break;
                        }
                        case 4 -> {
                            gears.getDamage();
                            System.out.println("Gears destability +" + gears.getDurability());
                        }
                        case 5 -> {
                            saddle.getDamage();
                            System.out.println("Saddfe destability +" + saddle.getDurability());
                        }
                        default -> throw new IllegalStateException("Unexpected value: " + partNumber);
                    }
                    durability = Math.min(Math.min(wheel.getDurability(), frame.getDurability()), Math.min(saddle.getDurability(), handlebar.getDurability()));

                } else throw new IllegalArgumentException(" ");
            } catch (IllegalArgumentException e) {
                System.out.println("You inputted unknown value");
            }
        }
        System.out.println("Bicycle felt");
    }
}