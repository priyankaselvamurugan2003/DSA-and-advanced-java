import java.io.*;
import  java.util.*;
public class evendigit
{
public int EvenDigitsSum(int inpu1){
int sum=0;
while(input1!=0)
{
int n=input1%10;
if(n%2==0)
sum+=n;
input1/=10; 
}
return sum;
}