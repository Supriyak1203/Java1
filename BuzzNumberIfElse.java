import java.util.*;
class BuzzNumberIfElse
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Entre the 2 digit number:");
int num=sc.nextInt();
if(num>=10 && num<=99)
{
if(num/7==0 || num%10==7)
  {
     System.out.println("number is buzz number");
  }
    else
   {
    System.out.println("number is not buzz number");
   }
}
}
}

