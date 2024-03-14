class DuckNumber
{
public static void main(String[]args)
{
int num=1340;
int numcopy=num;
int r=0;
while(num>0)
{
r=num%10;
if(r==0)
{
System.out.println("Number is duck Number");
break;
}
num=num/10;
}

if(num==0)
{
System.out.println("Number is not duck Number");
}
}
}
/*output
Compile time-Success
Run time-
Number is duck Number
*/
