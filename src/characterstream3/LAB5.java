package characterstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB5 {
    public static void main(String[] args) {
        try {   
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            
            
            String name = input.readLine();
//            int age = (int) input.readLine();
//            double weight = (double) input.readLine();
//            double height = (double) input.readLine();
              System.out.println(name);
//            System.out.println(age);
//            System.out.println(weight);
//            System.out.println(height);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
