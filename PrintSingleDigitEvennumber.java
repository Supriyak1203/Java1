class PrintSingleDigitEvennumber
{
public static void main(String[]args)
{
int a=120303;
do
{
int b=a%10;
if(b%2==0)
{
System.out.println(b);
}
a=a/10;
}while(a>0);
}
}
/* output
Compile time-success
Run time
0
0
2
*/