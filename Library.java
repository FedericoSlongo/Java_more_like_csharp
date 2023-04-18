/*
 * Libreria di Federico Slongo.
 * https://github.com/FedericoSlongo
 */
package [package_name_here];

import java.util.Scanner;

public class Library {
    Scanner var;
    public Library() {
        var = new Scanner(System.in);
    }
    
    public String ReadLine() {
        return var.nextLine();
    }
    
    public int ReadInt() {
        return var.nextInt();
    }
    
    public void WriteLine(String Stampa){
        System.out.println(Stampa);
    }
}
