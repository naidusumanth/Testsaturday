package Testjava;

public class IntersectionProgram {
	static void printIntersection(int arr1[], int arr2[], int sum, int sum1) 
    { 
      int i = 0, j = 0; 
      while (i < sum && j < sum1) 
      { 
        if (arr1[i] < arr2[j]) 
          i++; 
        else if (arr2[j] < arr1[i]) 
          j++; 
        else 
        { 
          System.out.print(arr2[j++]+" "); 
          i++; 
        } 
      } 
    } 
      
    public static void main(String args[]) 
    { 
        int arr1[] = {1,6,8,1,4}; 
        int arr2[] = {9, 2, 3, 7}; 
        int sum = arr1.length; 
        int sum1 = arr2.length; 
        printIntersection(arr1, arr2, sum, sum1); 
    } 
} 
