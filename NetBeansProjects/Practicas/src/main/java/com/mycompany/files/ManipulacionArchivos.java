
package com.mycompany.files;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;


public class ManipulacionArchivos {

    public static void main(String[] args) throws Exception{
        File archivo = new File("mi archivo.txt");
        archivo.createNewFile();
        
        FileWriter fw = new FileWriter(archivo);
        fw.write("mensaje");
        fw.close();

        Scanner sc = new Scanner(archivo);
        
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        
        JFileChooser chooser = new JFileChooser(".");
        
        int response = chooser.showOpenDialog(null);
        
        if(response == JFileChooser.APPROVE_OPTION){
            System.out.println(chooser.getSelectedFile().getAbsolutePath());
        }
        
    }
    
}
