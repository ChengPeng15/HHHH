package Java集合;

import java.util.Arrays;

public class ArrayDemo {
public static void main(String[] args) {
int[] arr1 = {1, 2, 3, 4, 5}; 
int[] arr2 = Arrays.copyOf(arr1, 10);

for(int i = 0; i < arr2.length; i++) 
System.out.print(arr2[i] + " "); 
System.out.println();
arr2[3]=99;
for(int i = 0; i < arr1.length; i++) 
System.out.print(arr1[i] + " "); 
System.out.println();


for(int i = 0; i < arr2.length; i++) 
System.out.print(arr2[i] + " "); 
System.out.println();
}
}
