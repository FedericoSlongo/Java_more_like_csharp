/*
 * Libreria di Federico Slongo.
 * https://github.com/FedericoSlongo
 */
package org.example;

import java.util.Scanner;

public class Library {
    Scanner var;
    public Library() {
        var = new Scanner(System.in);
    }

    //Reads a line from the console
    public String ReadLine() {
        return var.nextLine();
    }

    //Reads a line from the console and converts it to an int
    public int ReadInt() {
        return var.nextInt();
    }

    //Reads a line from the console and converts it to a float
    public float Readfloat() {
        return var.nextFloat();
    }

    //Prints out the input it recives when the function is called
    public void WriteLine(String print){
        System.out.println(print);
    }
}
