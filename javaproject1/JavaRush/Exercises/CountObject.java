package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/*
 * 
 * Javarush
 * СЧЕТЧИК ОБЕКТОВ
 * 
 */

public class CountObject {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.count++;

        Cat cat2 = new Cat();
        cat2.count++;

        System.out.println("Всего объектов: " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}

