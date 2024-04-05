class CoPrime
{
public static void main(String[]args)
{
int a=17;
int b=12;
int c=0;
for(int i=2;i>0;i++)
{
if(a%i==0 && b%i==0)
{
c++;
if(c>0)
{
break;
}
}
}
if(c==0)
{
System.out.println("CoPrime Number");
}
else{
System.out.println("Not CoPrime Number");
}
}
}
/*output
Compile time-Success
Run time-Success
CoPrime Number
*/
