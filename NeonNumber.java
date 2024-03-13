class NeonNumber
{
public static void main(String []args)
{
int num=13;
int square=num*num;

int sum=0;
while(square>0)
{
int r=square%10;
square=square/10;
sum=sum+r;
}
if(sum==num)
{
System.out.println("Number is neon number");
}
else{
System.out.println("Number is not neon number");
}
}
}
/*
Output-
Compile time-Success
Run time-
Number is not neon number
*/