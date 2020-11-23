/*
Project : Myfirstprogram
File    : myfirstprogram.java
Name    : Joseph Dimmick
Date    : 21 Sept. 2016

Description : This is my first program, literally. This program is
an assignment that I attempted to add some character in an attempt to
make it a little more personal.

1) Ask user to enter name and age
2) display their name, age and welcome message using a printf statement
*/
import java.util.Scanner;

public class Myfirstprogram
{
    
public static void main(String[] args) 
    {
    
    System.out.println("Hello! My name is Robotasha. I do not believe we have met what is your name?");
                //asking user their name with some added fun.
            String name; 
                // assgining string with id name for user input    
        Scanner sn = new Scanner(System.in);
                // importing my scanner and gave it the id=sn for scanner name.
            name = sn.next();
    System.out.print("Hello " +name);
                // saying hello using the user input.
        
    System.out.println("; How old are you?");
                // asking how old user is.
        
        Scanner sy = new Scanner (System.in);
                //importing my scanner for age id=sy
            int age = sy.nextInt();
    System.out.printf("You are "+name+", you are "+age+" years old. Welcome to our club house!\n");
    }
    
}
