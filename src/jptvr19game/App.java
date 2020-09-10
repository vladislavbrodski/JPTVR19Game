/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        System.out.println("Привет");
        System.out.println("Программа задула число, угадай:");
        Random random = new Random();
        int myNamber = random.nextInt(5 - 0 + 1 ) + 0;
        Scanner scanner = new Scanner(System.in);
        int gamerNamber =  scanner.nextInt();
        if (myNamber == gamerNamber){
            System.out.println("Ты выиграл!");
            System.out.println("Число: " + myNamber);
        }else{
            System.out.println("Ты проиграл! Было задумано: " + myNamber);
        }
    }
    
}
