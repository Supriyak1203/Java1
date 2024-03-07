class PrintSingleDigit
{
public static void main(String []args)
{
int a=124522;
do
{
int b=a%10;
System.out.println(b);
a=a/10;
}while(a>0);
}
}
/*
Output
Compile time-Success
Run time
2
2
5
4
2
1
*/