class PerfectNumber
{
public static void main(String[]args)
{
int a=6;
int pro=1;
for(int i=2;i<=a/2;i++)
{
if(a%i==0)
{
pro=pro+i;
}
}
if(pro==a)
{
System.out.println("Perfect Number");
}
else{
System.out.println("Not Perfect Number");
}
}
}
/*output
compile time-success
runtime-success
Perfect Number
*/