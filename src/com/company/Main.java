package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\roukorjerte\\Desktop\\test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String input = scanner.nextLine();
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();


        String path2 = "C:\\Users\\roukorjerte\\Desktop\\test2.txt";
        File file2 = new File(path2);

        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString){
           numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner2.close();
    }
}
