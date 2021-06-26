package Testjava;

public class UnionProgram {
	static void Union(int arr1[],  
            int arr2[]) 
{ 

int sum = arr1[arr1.length - 1]; 
int sum2 = arr2[arr2.length - 1]; 

int sol = 0; 

if(sum > sum2) 
{ 
sol = sum; 
} 
else
sol = sum2; 


int newtable[] = new int[sol + 1]; 


System.out.print(arr1[0] + " "); 


++newtable[arr1[0]]; 

 
for(int i = 1; i < arr1.length; i++) 
{ 

if(arr1[i] != arr1[i - 1]) 
{ 
 System.out.print(arr1[i] + " "); 
 ++newtable[arr1[i]]; 
} 
} 

         
for(int j = 0; j < arr2.length; j++) 
{ 

if(newtable[arr2[j]] == 0) 
{ 
 System.out.print(arr2[j] + " "); 
 ++newtable[arr2[j]]; 
} 
} 
} 


public static void main(String args[]) 
{ 
int arr1[] = {1, 2, 2, 2, 3}; 
int arr2[] = {2, 3, 4, 5}; 

Union(arr1, arr2); 
}
}
