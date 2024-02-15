class PercentageOfMarks
{
public static void main(String[]args)
{
int cs=100;
int ai=80;
int wt=100;
int dsbda=60;
int cns=90;
//calculate the marks
int marks=cs+ai+wt+dsbda+cns;
System.out.println("Marks:" +totalmarks);
//calculate percentage
float percentage=((marks)*100)/500;
int perc=(int)percentage;//type casting operator

char grade=(perc>=90 && perc<=100)?('A'):
((perc<90 && perc>=75)?('B'):
(perc<75&& perc>=55)?('C'):
(perc<55&& perc>=35)?('P'):('F'));
System.out.println("Grade:"+grade);
}
} 

//output-
Compile time-success
Runtime-success
Totalmarks:430
Grade:B