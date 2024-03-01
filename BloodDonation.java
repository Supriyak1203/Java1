class BloodDonation
{
public static void main(String []args)
{
int homoglobin=13;
int age=25;
boolean disease=false;
boolean drugs=false;
if(age>=18 && age<=60)
{
if(homoglobin>=13)
{
if(disease==false)
{
if(drugs==false)
{
System.out.println("you are eligible for blood donation");
}
else
{
System.out.println("you can not donat you are drugs addict");
}
}
else
{
System.out.println("you can not donat you have disease");
}
}
else
{
System.out.println("you can not donat your hemoglobin is less than 13");
}
}
else
{
System.out.println("you are not eligible for blood donation  ");
}
}
}
//output
compile time-success
Run time-
    you are eligible for blood donation





