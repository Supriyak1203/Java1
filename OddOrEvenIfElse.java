import java.util.*;
class OddOrEvenIfElse
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Entre the 2 digit number:");
int num=sc.nextInt();
if(num>=10 && num<=99)
{
if(num%2==0)
  {
     System.out.println("number is even number");
  }
    else
   {
    System.out.println("number is  odd number");
   }
}
}
}

