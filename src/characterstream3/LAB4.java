package characterstream3;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB4 {
    public static void main(String[] args) {
        try {   
            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            
            String name = input.nextLine();
            int age = input.nextInt();
            double weight = input.nextDouble();
            double height = input.nextDouble();
            System.out.println(name);
            System.out.println(age);
            System.out.println(weight);
            System.out.println(height);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
