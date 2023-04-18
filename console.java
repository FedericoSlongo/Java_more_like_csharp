/*
 * Library created by Federico Slongo.
 * https://github.com/FedericoSlongo
 */
package [package_name];

import java.util.Scanner;

public class console {
    Scanner var;
    public console() {
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
