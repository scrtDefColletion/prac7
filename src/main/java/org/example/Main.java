package org.example;

import java.util.concurrent.Semaphore;

public class Main
{
    public static void main(String[] args)
    {
        System.out.printf("Practical task 7. Variant 2. Student Kalakutin S.R. Group RIBO-04-21 \n \n");
        Semaphore table = new Semaphore(2);
        for(int i = 1; i<=7; i++){
            new Thread(new StudentRunnable(table), "Student" + i).start();
        }
    }
}