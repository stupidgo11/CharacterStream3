package characterstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB5 {
    public static void main(String[] args) {  
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        System.out.print("Enter name: ");
        try {
            String name = input.readLine();
            System.out.println(name);
            System.out.print("Enter age:");
            String age = input.readLine();
            System.out.println(age);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
