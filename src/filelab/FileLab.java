/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filelab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tim
 */
public class FileLab {

    public static void main(String[] args) throws FileNotFoundException {

        
        
        BufferedReader in = new BufferedReader(new FileReader(file));
        
        int count = 1;
        try {
            String line  = in.readLine();
            while(line != null) {
                switch(count) {
                    case 1: 
                        System.out.println("First Name: " + line.split(" ")[0]);
                        System.out.println("Last Name: " + line.split(" ")[1]);
                        break;
                    case 2: 
                        System.out.println("Address: " + line);
                        break;
                    case 3:
                        String[] split = line.split(",");
                        System.out.println("City: " + split[0].replace(",", ""));
                        System.out.println("State: " + split[1].split(" ")[1]);
                        System.out.println("Zip: " + split[1].split(" ")[2]);
                        break;
                }
                if(count >= 3) {
                    count = 0;
                }
                line = in.readLine();
                count++;
            }
            in.close();
        } catch(IOException e) {
            
        }
        
        
        
    }
    
}
