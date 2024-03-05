import java.util.Scanner;
class Swaping
{
public static void main(String[]args)
{
// create object
Scanner sc=new Scanner(System.in);
System.out.println("Entre the Number1:");
int a=sc.nextInt();
System.out.println("Entre the Number2:");
int b=sc.nextInt();
// swapping with using 3rd variable
int c=0;
System.out.println("Number before swapping:"+a+":"+b);
c=a;
a=b;
b=c;
System.out.println("Number after swapping:"+a+":"+b);
// swapping without using 3rd variable
a=a+b;//10+20=30
b=a-b;//30-20=10
a=a-b;//30-10=20
System.out.println("Number after swapping:"+a+":"+b);
// swapping without using 3rd variable
a=a*b;//10*20=200
b=a/b;//200/20=10
a=a/b;//200/10=20
System.out.println("Number after swapping:"+a+":"+b);

}
}

// output 
compile time-success
Run time -Entre the Number1:
10
Entre the Number2:
20
Number before swapping:10:20
Number after swapping:20:10
Number after swapping:10:20
Number after swapping:20:10

