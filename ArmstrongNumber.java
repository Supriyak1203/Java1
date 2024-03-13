class ArmstrongNumber
{
public static void main(String[]args)
{
int number=153;
int c=0;
int numcopy=number;
int numcopy1=number;
while(number>0)
{ 
    int r=number%10;
c++;
number=number/10;
}
//fetching each digit
int result=0;
while(numcopy>0)
{
int rem=numcopy%10;
//calculating power of each digit power is count
int product=1;
for(int i=1;i<=c;i++)
{
product=product*rem;
}
numcopy=numcopy/10;

result=result+product;

}
if(result==numcopy1)
{
System.out.println("Number is armstrong number");
}
else
{
System.out.println("Number is not armstrong number");
}
}
}
/*
 * output
 * Compile time - success
 * Run time-Number is armstrong number
 */