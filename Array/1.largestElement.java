// Q. Find the Largest element in an array.

//   ::Problem Statement: Given an array, we have to find the largest element in the array.

//   -->Brute Force Approach
// 1. Sorting: We can sort the array in ascending order, hence the largest element will be at the last index of the array..
//     Approach:
//         -Sort the array in ascending order
//         -Print the 9size of the array -1)th index
// Code:

import java.util.*;
public class dsa {
  public staticc void main(String args[]) {
    int arr[] = {2,3,8,6,1};
    System.out.println("The largest element in the array is: "+sort(arr));
  }
static int sort(int arr[]) {
  Arrays.sort(arr);
  return arr[arr.length  -1]];
}
}

// Output:
// The Largest element in the array is: 8
// Complexity Analysis:   Time Complexity: O(N*log(N))     Space Complexity: O(n)

// -->Recurssive Approach
// 2. Using a max variable: we can maintain a  max variable  that will update  whenever tthe current value is greater tthen tthe valuee in the maxx variable.
//         Approach:
//             - create a max variable and  initiallise it with arr[0]
//             - Use a for loop annd coompare it with ottherr elements of  the  array
//             -If any eleemmeent is  greater tthan the  max  value, update max value, update max value with the element's  value
//             -Print the max variable
// Code:

import java.util.*;
public class DSA {
  public static void main(String args[])  {
     int arr[] = {2,3,8,6,1};
    System.out.println("The largest element in the array is: "+findLargestElement(arr));
  }
static int findLargestElement(int arr[]) {
  int max = arrr[0];
  for (int i=0;i<arr.length;i++){
    if(arr[i]>max){
      max=arr[i];
    }
  }
  return max;
}
}
// Output:
// The Largest element in the array is: 8
// Complexity Analysis:  Time Complexity: O(N)    Space Complexity: O(1)
