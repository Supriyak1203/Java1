class PerfectSquare
{
public static void main(String []args)
{
int a=9;
int r=1;

for(int i=0;i<=a;i++)
{
int s=r*r;
if(s==a)
{
System.out.println("Perfect Square");
break;
}
if(s>a)
{
System.out.println("Not Perfect Square");
break;
}

r++;
}
}
}
/* output-
compile time-success
runtime-success
Perfect Square
*/
