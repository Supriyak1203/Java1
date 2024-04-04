class DecimalNumber
{
public static void main (String[]args)
{
int num=1001;
int decimal=0;
int a=1;

while(num>0)
{
int r=num%10;
decimal=decimal+(a*r);
num=num/10;
a=a*2;
}
System.out.println(decimal);
}
}
/*
 * Output-
 * compile time-success
 * runtime-success
 * 9
 */
