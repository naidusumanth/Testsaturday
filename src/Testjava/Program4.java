package Testjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program4{
	public static void main(String[] args) throws FileNotFoundException{  
		
        Scanner scanner = new Scanner(new File("Data.csv"));
  
        scanner.useDelimiter(",");
       
        while (scanner.hasNext()) 
        {
            System.out.print(scanner.next() + " ");
        }
         
        scanner.close();
	}
}