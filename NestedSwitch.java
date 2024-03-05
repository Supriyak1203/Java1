class NestedSwitch
{
public static void main(String [] args)
{
int num=100;
int key=3;
switch(key)
{
case 1:if(num % 2==0)
{
System.out.println("Number is even");
}
else{
System.out.println("Number is odd");
}
break;
case 2:if(num % 7==0 || num % 10==7)
{
System.out.println("Number is buzz");
}
else{
System.out.println("Number is not buzz");
}
break;
case 3:if(num >=0)
{
System.out.println("Number is positive");
}
else{
System.out.println("Number is Negative");
}
break;
case 4:if(num >=10 && num <=99)
{
System.out.println("Number is two digit");
}
else{
System.out.println("Number is not two digit");
}
break;
}
}
}

//output
Compile time-Success
Run time-Success
Number is positive
