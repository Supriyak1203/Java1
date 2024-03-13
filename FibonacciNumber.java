class FibonacciNumber
{
public static void main(String[] args)
{
int a=0;
int b=1;
int num=6;
System.out.print(a+" ");
System.out.print(b+" ");
for(int i=0;i<=num;i++)
{
int temp=a+b;
a=b;
b=temp;
System.out.print(temp+" ");
}
}
}
/*output-
Compile time-Success
Run time-
0 1 1 2 3 5 8 13 21
*/