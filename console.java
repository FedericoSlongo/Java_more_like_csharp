/*
 * Library created by Federico Slongo.
 * https://github.com/FedericoSlongo
 *
 * This .java is part of the https://github.com/FedericoSlongo/Java_more_like_csharp repo
 */

package [package_name];

import java.util.Objects;
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
    public float ReadFloat() {
        return var.nextFloat();
    }

    //Reads a line from the console and converts it to a double
    public double ReadDouble() {
        return var.nextDouble();
    }

    //Prints out the input it recives when the function is called
    public static void WriteLine(Objects print){
        System.out.println(print);
    }
}
