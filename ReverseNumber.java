class ReverseNumber
{
public static void main(String[]args)
{
int a=1023;
int b=0;
do
{
int r=a%10;
b=b*10+r;
a=a/10;
}while(a>0);
System.out.println(b);
}
}
/* output
  Compile time-success
  Run time
  3
  2
  0
  1
  */
