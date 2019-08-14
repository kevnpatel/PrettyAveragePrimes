package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        int nums;

        nums = s.nextInt();

        int[] array = new int[nums];


        for (int i = 0; i < nums; i++){

            array[i] = s.nextInt();


            for (int j = 3; j < array[i] * 2; j = j + 2){

                //System.out.println(i + " " + j);

                if ((array[i]* 2 - j) % 2 != 0){

                   System.out.println(array[i]* 2 - j + " " + j);

                   j = array[i] * 2;

                }
            }


        }

    }
}
