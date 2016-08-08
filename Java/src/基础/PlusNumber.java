package 基础;

import java.util.*;
public class PlusNumber { 
static int sum = 0;
static int remainderNumber = 0;
public static void main(String[] args) {
System.out.println("Give the two number:");
int Min = 0;int Max = 0;
Scanner sc = new Scanner(System.in);
Min = sc.nextInt();Max = sc.nextInt();
System.out.println("Min = " + Min + "\tMax = " + Max + "\t");
int sum = AddMinToMax(Min,Max);
System.out.println("sum = " + sum);
}
public static int AddMinToMax(int Min,int Max) {
if (Min + 1 == Max)
{ 
return Min + Max;
}
remainderNumber = Max - Min +1;
sum = (int) (remainderNumber * (double)(Min+Max)/2);
return sum ;
}
}
