/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filelab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tim
 */
public class FileLab {

    public static void main(String[] args) throws FileNotFoundException {

        String file = "/Users/tim/Documents/mailingList.txt";
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
            writer.write("Tim Christensen");
            writer.println();
            writer.write("555 Somewhere Lane");
            writer.println();
            writer.write("Milwaukee, WI 53226");
            writer.println();
        
            writer.write("John Doe");
            writer.println();
            writer.write("555 Somewhere Lane");
            writer.println();
            writer.write("Milwaukee, WI 53226");
            writer.println();
            
            writer.write("Jane Doe");
            writer.println();
            writer.write("555 Somewhere Lane");
            writer.println();
            writer.write("Milwaukee, WI 53226");
            writer.println();
            
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FileLab.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
                        System.out.println("City: " + line.split(" ")[0].replace(",", ""));
                        System.out.println("State: " + line.split(" ")[1]);
                        System.out.println("Zip: " + line.split(" ")[2]);
                        break;
                }
                if(count >= 3) {
                    count = 0;
                }
                line = in.readLine();
                count++;
            }
        } catch(IOException e) {
            
        }
        
        
    }
    
}
