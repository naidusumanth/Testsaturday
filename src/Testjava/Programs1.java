package Testjava;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Programs1 {

		 
	    public static void main(String args[]) {            
	       

	       java.util.List<String> dataList= new ArrayList<String>();
	     
	   
	       dataList.add("data");
	       dataList.add("Work");
	       dataList.add("Programing");
	       dataList.add("task"); 
	     
	        System.err.println(" List of  programs : " + dataList);
	     

	        dataList = Collections.unmodifiableList(dataList);
	     
	      
	        dataList.add("adding to java list programs ");

	       
	        dataList.remove("tasking"); 
	     
	        
	        dataList.set(0, "programs of java");

	     
	        
	     
	            
	        Set<String> set = new HashSet<String>(dataList);
	     
	        System.out.println(" Set in Java : " + set);

	       
	        set.add("good morning");

	        System.out.println(" java reading program  only : " + set);
	     
	        
	       set = Collections.unmodifiableSet(set);
	     
	     
	        set.add("You can not add element in read Only Set");
	     
	       
	       set.remove("Datatasking "); 
	     
	     
	     
	       
	     
	        Map<String, String> maping  = new HashMap<String, String>();      
	        maping.put("morning", "datagood ");
	     
	       
	        maping.put("system", "internet");
	     
	        System.out.println("Map in Java before making read only: " + maping);
	     
	      
	        Map readOnlyMap = Collections.unmodifiableMap(maping);
	       
	        
	        readOnlyMap.put("datagoodwithyou", "roundaround"); 
	       
	        
	        readOnlyMap.remove("source ");
	    }
}
	
