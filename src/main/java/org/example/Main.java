package org.example;

import java.util.concurrent.Semaphore;

public class Main
{
    public static void main(String[] args)
    {
        Semaphore table = new Semaphore(2);
        for(int i = 1; i<=7; i++){
            new Thread(new StudentRunnable(table), "Student" + i).start();
        }
    }
}