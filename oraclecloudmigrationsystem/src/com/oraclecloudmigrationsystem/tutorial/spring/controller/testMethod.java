package com.oraclecloudmigrationsystem.tutorial.spring.controller;

import java.io.IOException;
import java.io.*;

//public class testMethod{
//public int add(int a,int b) throws IOException, InterruptedException{
//	Runtime.getRuntime().exec("C:\\Program Files\\VMware\\VMwareOVFTool\\README.txt");
	
//	Runtime rt = Runtime.getRuntime();
//	Process pr = rt.exec("C:\\\\Program Files\\\\Opera\\\\launcher.exe");
//	int exitVal = pr.waitFor();
//	System.out.println("Exited with error code "+exitVal);
	
	
//	Runtime rt = Runtime.getRuntime();
//	String[] commands = {"C:\\Program Files\\Opera\\launcher.exe"};
//	Process proc = rt.exec(commands);

//	BufferedReader stdInput = new BufferedReader(new 
//	     InputStreamReader(proc.getInputStream()));

//	BufferedReader stdError = new BufferedReader(new 
//	     InputStreamReader(proc.getErrorStream()));

	// read the output from the command
//	System.out.println("Here is the standard output of the command:\n");
//	String s = null;
//	while ((s = stdInput.readLine()) != null) {
//	    System.out.println(s);
//	}

	// read any errors from the attempted command
//	System.out.println("Here is the standard error of the command (if any):\n");
//	while ((s = stdError.readLine()) != null) {
//	    System.out.println(s);
//	}
	
	
	
	
	
//return a+b;
//}
//}

public class testMethod 
{ 
    public static void main(String args[]) 
    { 
        try 
        { 
            Process p=Runtime.getRuntime().exec("C:\\7-Zip\\7z a D:\\vm_ovf\\test.tar.gz D:\\vm_ovf\\test.img"); 
            p.waitFor(); 
            BufferedReader reader=new BufferedReader(
                new InputStreamReader(p.getInputStream())
                
            ); 
            System.out.println(reader);
            String line; 
            while((line = reader.readLine()) != null) 
            { 
                System.out.println(line);
            } 

        }
        catch(IOException e1) {e1.printStackTrace();} 
        catch(InterruptedException e2) {e2.printStackTrace();} 

        System.out.println("Done"); 
    } 
}