class HarshadNumber
{
public static void main(String[]args)
{
int a=45;
int numcopy=a;
int sum=0;
while(a>0)
{
int r=a%10;
sum=sum+r;
a=a/10;
}
if(numcopy%sum==0)
{
System.out.println("Number is harshad number");
}
else{
System.out.println("Number is not harshad number");
}
}
}
/*output
compile time-Success
Run time-
Number is harshad number
*/