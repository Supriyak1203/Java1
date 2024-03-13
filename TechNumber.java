class TechNumber
{
public static void main(String[] args)
{
int num=2025;
int c=0;
int numcopy=num;
int numcopy1=num;
int numcopy2=num;
while(num>0)
{
int r=num%10;
c++;
num=num/10;
}
if(c%2==0)
{
int div=1;
for(int i=1;i<=c/2;i++)
{
div=div*10;
}

int a=numcopy/div;
System.out.println("The number is frist half:"+a);
int b=numcopy1%div;
System.out.println("The number is second half:"+b);


int result=0;
result=a+b;
if((result*result)==numcopy2)
{
System.out.println("The Number is tech");
}
else{
System.out.println("The number is not tech");
}
}
else{
System.out.println("The number is having odd number of digit");
}
}
}
/*Output-
Compile time-Success
Run time-
The number is frist half:20
The number is second half:25
The Number is tech
*/
