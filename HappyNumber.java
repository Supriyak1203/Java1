class HappyNumber
{
public static void main(String[]args)
{
int n=25;
int sum=0;
while(n>9 || sum>9)
{
if(n==0)
{
n=sum;
sum=0;
}
while(n>0)
{
int r=n%10;
sum=(r*r)+sum;
n=n/10;
}


}
if(sum==1)
{
System.out.println("Happy Number");
}
else{
System.out.println("Not Happy Number");
}
}
}