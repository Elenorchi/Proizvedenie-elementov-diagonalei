package com.TMS;

/* Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
Проверить произведение элементов какой диагонали больше. */


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int b = 1;
        int c = 1;
        System.out.println("Введите размер кв.матрицы: ");
        int a = scan.nextInt();
        int[][] massive = new int[a][a];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = rnd.nextInt(50);
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < massive.length; i++) {
            for (int j = massive.length - 1 - i; j >= 0; j--) {
                b = b * massive[i][j];
                break;
            }
        }
        for (int i = 0; i < massive.length; i++) {
            c = c * massive[i][i];
        }
        if (b>c) {
            System.out.println("Произведение элемнтов побочной диагонали больше");
        } else if (c>b) {
            System.out.println("Произведение элемнтов главной диагонали больше");
        }
        else if (c==b) {
            System.out.println("Произведение элемнтов обеих диагоналей одинаково");
        }
    }
}