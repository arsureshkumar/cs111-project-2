/*
 * Project #2
 * Source Code File: Magic8Ball.java
 * Programmer: Arjun Suresh Kumar
 * Due: 9/29/21
 * Description: A program that randomly
 * displays Magic 8 Ball responses.
 */

package Project2;

import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your question? ");
        String input = scanner.nextLine();

        scanner.close();

        int randomNumber = (int) (Math.random()*20.0);
        String randomResponse = "";

        switch(randomNumber){
            case 0:
                randomResponse = "It is certain";
                break;
            case 1:
                randomResponse = "It is decidedly so";
                break;
            case 2:
                randomResponse = "Without a doubt";
                break;
            case 3:
                randomResponse = "Yes definitely";
                break;
            case 4:
                randomResponse = "You may rely on it";
                break;
            case 5:
                randomResponse = "As I see it, yes";
                break;
            case 6:
                randomResponse = "Most likely";
                break;
            case 7:
                randomResponse = "Outlook good";
                break;
            case 8:
                randomResponse = "Yes";
                break;
            case 9:
                randomResponse = "Signs point to yes";
                break;
            case 10:
                randomResponse = "Reply hazy try again";
                break;
            case 11:
                randomResponse = "Ask again later";
                break;
            case 12:
                randomResponse = "Better not tell you now";
                break;
            case 13:
                randomResponse = "Cannot predict now";
                break;
            case 14:
                randomResponse = "Concentrate and ask again";
                break;
            case 15:
                randomResponse = "Don't count on it";
                break;
            case 16:
                randomResponse = "My reply is no";
                break;
            case 17:
                randomResponse = "My sources say no";
                break;
            case 18:
                randomResponse = "Outlook not so good";
                break;
            case 19:
                randomResponse = "Very doubtful";
                break;
        }

        System.out.println("Your question was: " + input);
        System.out.println("My answer is: " + randomResponse);
    }
}
