/*
 * Library created by Federico Slongo.
 * https://github.com/FedericoSlongo
 *
 * This .java is part of the https://github.com/FedericoSlongo/Java_more_like_csharp repo
 */

package [package_name];

import java.io.*;
import java.io.FileWriter;

public class files {
    private BufferedReader fr;
    private File f;
    FileWriter myWriter;
    private String line;

    public files(String file_name) throws IOException {
        fr = new BufferedReader(new FileReader(file_name));
        f = new File(file_name);
        myWriter = new FileWriter(file_name);
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

    public boolean createNewFile() throws IOException {
        return f.createNewFile();
    }

    public void WriteLine(String toWrite) throws IOException {
        myWriter.write(toWrite);
    }
    public void close() throws IOException {
        myWriter.close();
    }
}
