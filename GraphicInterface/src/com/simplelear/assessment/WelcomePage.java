package com.simplelear.assessment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.simplelear.assessment.FileOptionMenu;

public class WelcomePage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String devName = "Mauricio Rhoden";
		String CompanyName = "Company Lockers Pvt. Ltd";
		String aplicationName = "LockedMe.com";
		String softVersion = "Prototype 1.0";
		
		
		
		Scanner s = new Scanner(System.in);
		 System.out.println("--------------------------------------------------------");
	        System.out.println("Welcome to " + aplicationName + " By " + CompanyName);
	        System.out.println("Developer Name: " + devName);
	        System.out.println("--------------------------------------------------------");        
	        System.out.println("Please Choose an option to Start:");    
	        System.out.println("\n--------------------------------------------------------");
	        System.out.println("0 - Exit");
	        System.out.println("1 - Return All Current File Names");
	        System.out.println("2 - File Options Menu");
	        System.out.println("--------------------------------------------------------");
		
	        while(s.hasNext()) {
	            if(s.hasNextInt()) {
	                while(s.hasNextInt()) {
	                    int choice = s.nextInt();
	                    
	                    switch (choice) {
	                    case 0 :
	                        Runtime.getRuntime().exit(0);
	                        break;
	                    case 1 :
	                    	
	                       
	                      
	                        break;
	                    case 2 :
	                    	System.out.println("Chegou no 2");	                    	
	                    	
	                    	Scanner menu2 = new Scanner(System.in);
	                    	
	               		 	System.out.println("--------------------------------------------------------");
	               	        System.out.println("Welcome to " + aplicationName + " By " + CompanyName);
	               	        System.out.println("Developer Name: " + devName);
	               	        System.out.println("--------------------------------------------------------");        
	               	        System.out.println("Please Choose an option to Start:");    
	               	        System.out.println("\n--------------------------------------------------------");
	               	        System.out.println("0 - Exit");
	               	        System.out.println("1 - Create a new file");
	               	        System.out.println("2 - Delete file");
	               	        System.out.println("--------------------------------------------------------");
	                    	
	               	     while(menu2.hasNext()) {
	         	            if(menu2.hasNextInt()) {
	         	                while(menu2.hasNextInt()) {
	         	                    int choiceMenuFile = menu2.nextInt();
	         	                    
	         	                    switch (choiceMenuFile) {
	         	                    case 0 :
	         	                        Runtime.getRuntime().exit(0);
	         	                        break;
	         	                    case 1 :
	         	                    	Scanner f =new Scanner(System.in);	                    	
	        	                        System.out.println("please type the new file name\n");
	        	                        String name = f.next();	                        
	        	                        FileOptionMenu file = new FileOptionMenu();
	        	                        file.setFileName(name + ".txt");
	        	                        file.createFile();      	                    	         	                       
	         	                        break;
	         	                    case 2 :  
	         	                    	Scanner d =new Scanner(System.in);	                    	
	        	                        System.out.println("please type the file name to be deleted\n");
	        	                        String fileToDelete = d.next();	                        
	        	                        FileOptionMenu fileName = new FileOptionMenu();
	        	                        fileName.setFileName(fileToDelete + ".txt");
	        	                        fileName.deleteFile();      	   
	         	                    	
	         	                    	break;   
	         							
	         	                    default :
	         	                        System.out.println("\n\nOption Invalid!!!!!\n");
	         	                        System.out.println("Please type the numer of desired option to continue:");    
	         	                        System.out.println("\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	         	                        System.out.println("0 - Exit");
	         	                        System.out.println("1 - Return All Current File Names");
	         	                        System.out.println("2 - File Options Menu");
	         	                        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	         	                        break;
	         	                    }
	         	                }
	         	            }
	         	            else {
	         	                System.out.println("\n\nOption Invalid!!!!!\n");
	         	                System.out.println("Please type the numer of desired option to continue:");    
	         	                System.out.println("\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	         	                System.out.println("0 - Exit");
	         	                System.out.println("1 - Return All Current File Names");
	         	                System.out.println("2 - File Options Menu");
	         	                System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	         	                menu2.next();
	         	            }
	         	        }
	                    	
	                    	
	                    	break;
	                    	
	                    	
	                    	
	                    	
	                    default :
	                        System.out.println("\n\nOption Invalid!!!!!\n");
	                        System.out.println("Please type the numer of desired option to continue:");    
	                        System.out.println("\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	                        System.out.println("0 - Exit");
	                        System.out.println("1 - Return All Current File Names");
	                        System.out.println("2 - File Options Menu");
	                        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	                        break;
	                    }
	                }
	            }
	            else {
	                System.out.println("\n\nOption Invalid!!!!!\n");
	                System.out.println("Please type the numer of desired option to continue:");    
	                System.out.println("\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	                System.out.println("0 - Exit");
	                System.out.println("1 - Return All Current File Names");
	                System.out.println("2 - File Options Menu");
	                System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	                s.next();
	            }
	        }

	}

}
