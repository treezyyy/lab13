package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String IP = in.nextLine();
        boolean result = IP.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)");
        if (result){
            System.out.println("ок");
        }
        else {
            System.out.println("error");
        }

        try (BufferedWriter fl = new BufferedWriter(new FileWriter("IP.txt"))){
            fl.write((IP));
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
