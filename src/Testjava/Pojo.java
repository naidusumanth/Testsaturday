package Testjava;

import java.util.Scanner;

public class Pojo {

		@SuppressWarnings("unused")
		public static void main(String[] args) {

		String ename = "VEnkatesh";
		int empid1 = 12345;
		String address = "guntur";
		
		String ename1 = "Surya";
		int empid2 = 13456;
		String address1 = "vijayanagaram ";
		
		String ename2 = "Sumanth";
		int empid3 = 1550;
		String address2 = "Rajamundry";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id");
		
	    int employeeid = sc.nextInt();
	    
	    if(empid1==employeeid) {
	    	
	    	System.out.println("Welcome to office");
	    }
	    
	    else if (empid2==employeeid) {
			
	    	System.out.println("Welcome to office");
		}
	    
	    else if (empid3==employeeid) {
	    	
	    	System.out.println("Welcome to offie");
		}
	    
	    else {
	    	
	    	System.out.println("Given Employee id is mismatched");
	    }
	    
	    
		}
	    
	   }