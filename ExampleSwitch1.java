class ExampleSwitch1
{
public static void main(String[]args)
{
int daynum=4;
switch(daynum)
{
case 1:System.out.println("Monday");
case 2:System.out.println("Tuesday");
case 3:System.out.println("wednesday");
case 4:System.out.println("Thursday");
case 5:System.out.println("Friday");
case 6:System.out.println("Saturday");
case 7:System.out.println("Sunday");
default:System.out.println("invalid");
}
}
}
//output
//compile time-success
Run time-success
Thursday
Friday
Saturday
Sunday
invalid