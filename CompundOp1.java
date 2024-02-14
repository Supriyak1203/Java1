class CompundOp1
{
public static void main(String []args)
{
int a=150;
double b=30.0;
//a=a/b;
//System.out.println(a);//compile time error
a/=b;//compound operator
System.out.println(a);
}
}

//output
Compile time-success
runtime-5