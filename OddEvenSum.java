
public class OddEvenSum{
public static void main (String args[]){
int i,num;  //declare variable i,num
int oddSum=0,evenSum=0;
num=5;//reads num1 from user
for(i=1; i<=num; i++){  
if(i%2==0) 
    evenSum=evenSum+i;
else
    oddSum=oddSum+i;
}
System.out.println("Sum of all odd numbers are: "+oddSum);
System.out.println("Sum of all even numbers are: "+evenSum);
}
}