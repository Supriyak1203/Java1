class HCF
{
public static void main(String[]args)
{
int n1=25;
int n2=50;
int smallest=(n1<n2)?(n1):(n2);
int i=smallest;
while(i>0)
{
if(n1%i==0 && n2%i==0)
{
System.out.println("the hcf "+i);
break;

}
i--;
}
}
}
/*output
Compile time-Success
Run time-
the hcf 25
*/