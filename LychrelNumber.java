class LychrelNumber
{
public static void main(String[]args)
{
int a=33;
int n=a;
int rev=0;
int sum=0;
while(a>0)
{
int r=a%10;
rev=rev*10+r;
a=a/10;
}
sum=rev+n;
System.out.println(sum);
int rev1=0;
int m=sum;
int sum1=0;
while(sum>0)
{
    int rem=sum%10;
    rev1=rev1*10+rem;
    sum=sum/10;
}
sum1=rev1+sum;;
if(m!=sum1)
{
System.out.println("Lychre Number");
}
else{
 System.out.println(" Not Lychre Number");
}
}
}
/*
 * Output-
 * Compile time-success
 * Run time-sucess
 * 66
   Not Lychre Number

 */


