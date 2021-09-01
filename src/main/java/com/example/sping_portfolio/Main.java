package com.example.sping_portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Main {

    public static void main(String[] args) {

        double grade1 = 99.00 ;

        double grade2 = 78.00 ;

        double grade3 = 66.00 ;

        double grade4 = 98.00 ;

        double grade5 = 75.00 ;

        double grade6 = (grade1 + grade2)/2 ;

        double grade7 = (grade3 + grade4)/2 ;

        double grade8 = (grade6 + grade7 + grade5/2)/3 ;

        System.out.println("grade6 is " + grade6);

        System.out.println("grade7 is " + grade7);

        System.out.println("grade8 is " + grade8);


    }
}



