package org.example.ui;

import org.example.model.Panel;

import java.util.Random;
import java.util.Scanner;
public class Main {
    Scanner reader;
    //Panel panel;
    public static void main(String[] args) {


    }

    public Main(){
        createPanel();
        reader = new Scanner(System.in);
        mainMenu();

    }

    private void createPanel() {
        System.out.println("Welcome player\n");
        System.out.println("Enter the number of rows: \n");
        int rows = reader.nextInt();
        System.out.println("Enter the number of columns: \n");
        int columns = reader.nextInt();

        panel = new Panel(rows, columns);
    }

    private void mainMenu() {
        int option = 0;

        do{
            System.out.println("Choose an option: \n");
            System.out.println("1. Tirar dado\n");
            System.out.println("2. Ver tablero\n");
            System.out.println("3. Salir\n");
            option = reader.nextInt();

            switch (option){
                case 1:
                    rollDice();
                    break;
                case 2:
                    showPanel();
                    break;
                case 3:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
        }




        }while (option != 3);

    }

    private void showPanel() {

    }

    private void rollDice() {


    }
}