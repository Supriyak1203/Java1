class EvilNumber
{
public static void main(String[]args)
{
int num=65;
int n1=num;
int binary=0;
int c=0;
int a=1;
while(num>0)
{
int r=num%2;
binary=binary+(r*a);
a=a*10;
num=num/2;
}
System.out.println(binary);
while(binary>0)
{
int rem=binary%10;
if(rem==1)
{
c++;
}
binary=binary/10;
}
if(c%2==0)
{
System.out.println("Evil Number");
}
else{
System.out.println("Not Evil Number");
}
}
}
