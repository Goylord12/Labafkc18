package com.company;
import java.util.Scanner;

//Создать класс, который выводит значение выражения 2*х+3/y. Создать можно только один объект данного класса

class SoleONe{
    private static SoleONe so = new SoleONe();
    private double x;
    private double y;
    private SoleONe(){

    }
    public static SoleONe getInstance(){
        return so;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double solve(){
        return (2 * x) + (3 / y);
    }
}

public class Main {
    public static void main(String[] args) {
        SoleONe so = SoleONe.getInstance();
        Scanner in = new Scanner(System.in);

        System.out.println("Выражение 2*х+3/y; Введите x: ");
        so.setX(in.nextDouble());

        System.out.println("Введите y: ");
        so.setY(in.nextDouble());

        System.out.println(so.solve());
    }
}