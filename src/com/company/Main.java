package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.print("Enter the number of inputs: ");

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        FileMaker[] file = new FileMaker[t];

        for (int i = 0; i < file.length; i++)
        {
            System.out.print("File Name: ");
            String fileName = input.nextLine();
            System.out.print("File Type:

        }

        for (int i = 0; i < file.length; i++)
        {
            file[i].showInfo();
        }
    }
}