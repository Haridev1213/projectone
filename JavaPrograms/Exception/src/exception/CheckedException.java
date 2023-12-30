/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *program name : Checked Exception operations
 * @author harid
 */
import java.io.File;

import java.io.*;
public class CheckedException {
public static void main(String[] args) throws FileNotFoundException {
File file=new File("abc.txt");
        FileInputStream fs=new FileInputStream(file);
/*try{
    FileInputStream fs=new FileInputStream(file);
}
catch(FileNotFoundException e)
{
    e.printStackTrace();
}
    System.out.println("end of program");

*/
   
    }

    }
   

