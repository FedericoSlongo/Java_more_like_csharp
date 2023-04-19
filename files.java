/*
 * Library created by Federico Slongo.
 * https://github.com/FedericoSlongo
 *
 * This .java is part of the https://github.com/FedericoSlongo/Java_more_like_csharp repo
 */

package [package_name];

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class files {
    private BufferedReader fr;
    private String line;

    public files(String file_name) throws FileNotFoundException {
        fr = new BufferedReader(new FileReader(file_name));
        line = "";
    }

    public String ReadLine() throws IOException {
        line=fr.readLine();
        if(line != null)
            return fr.readLine();
        else
            return null;
    }

    public String ReadAllLines() throws IOException {
        String Everything = "";
        while((line=fr.readLine())!=null)
            Everything += line;
        return Everything;
    }
}
