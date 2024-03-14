class LCM
{
public static void main(String[]args)
{
int n1=45;
int n2=5;
int largest=(n1>n2)?(n1):(n2);
int i=1;
int l1=largest;
while(true)
{
if(l1%n2==0 && l1%n1==0)
{
System.out.println("the lcm of given number is "+l1);
break;
}
i++;
l1=largest*i;
}
}
}
/*output
Compile time-Success
Run time-
the lcm of given number is 45
*/

