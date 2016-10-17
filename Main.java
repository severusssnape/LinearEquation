package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Данная программа находит корень линейного уравнения ax + b = 0");

        System.out.println("Введите число а: ");
        double a = scan.nextDouble();

        System.out.println("Введите число b: ");
        double b = scan.nextDouble();

        System.out.println("x = " + -b/a);
        scan.close();
            }
        }
