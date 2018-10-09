package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // creating a favorite movies array list

        ArrayList favoritemovies = new ArrayList();
        ArrayList<String> answer = new ArrayList<String>();


        while (true) {
            System.out.println("Enter your favorite movie");
            answer.add(scanner.nextLine());
            System.out.println(answer);

        }

    }
}



