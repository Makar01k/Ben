package com.example.demo1;

public  class HelloResource {
    static String name;
    int age;
    public void Woof(){
        System.out.println("Гав!");
    }
    public void jump (){
        System.out.println("Прыжок!");
    }

    static int count =0;

    public static void main (String[]args){
        Dog Ben =new Dog();
        Ben.age = 1;
        Ben.name ="Ben";
        System.out.println("Собака заболела"+ name + "его возрост - " +Ben.age);

        Ben.Woof();
        Ben.jump();
    }
}
