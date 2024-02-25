import java.util.Scanner;
class ReportCard
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Entre the marks:");
System.out.println("Entre the Math:");
int a=sc.nextInt();
System.out.println("Entre the English:");
int b=sc.nextInt();
System.out.println("Entre the Phycisc:");
int c=sc.nextInt();
System.out.println("Entre the History:");
int d=sc.nextInt();
System.out.println("Entre the chemistry:");
int e=sc.nextInt();
int marks_obtained=a+b+c+d+e;
int total=500;
double per=(marks_obtained*100)/500;
char grade=(per<=100 && per>85)?('A'):((per<=85 && per>65)?('B'):((per<=65 && per>45)?('C'):((per<=45 && per>35)?('E'):('F'))));
String remark=(grade =='A')?("very good"):((grade =='B')?("good"):((grade =='C')?("need to improve"):((grade =='E')?("work hard"):("not need to hard"))));
System.out.println(grade);
System.out.println(remark);



System.out.println("*********************************************Report Card***************************************************************************");
System.out.println("                                          S.R.V.S.K.V.Shrigonda            ");
System.out.println("                                               SSC Borad                    ");
System.out.println("");
System.out.println("Name: Supriya Kale                                                  Date:21/02/2024");
System.out.println("Roll No:3325                                Sec:D                   Exam:Unit test");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
System.out.println("  Subjects                               total marks                  Obtained marks"); 
System.out.println("_______________________________________________________________________________________________________________________________");
System.out.println("  Math                                      100                            "+a      );   
System.out.println("  English                                   100                            "+b      );    
System.out.println("  Physics                                   100                            "+c      );   
System.out.println("  History                                   100                            "+d      );   
System.out.println("  Chemistry                                 100                            "+e      );   
System.out.println(" "); 
System.out.println(" ________________________________________________________________________________________________________________________________"); 
 System.out.println("");
System.out.println("Total                                       500                        Marks obtained:"+marks_obtained         );
System.out.println("Percentage: " + per + "                                                       Grade: " + grade                      );
System.out.println("Remark: " + remark + "                                                        Sign:                               ");
System.out.println("_____________________________________________________________________________________________________________________________");
}
} 
//output 
Entre the marks:
Entre the Math:
92
Entre the English:
78
Entre the Phycisc:
66
Entre the History:
80
Entre the chemistry:
85
B
good
*********************************************Report Card***************************************************************************
                                          S.R.V.S.K.V.Shrigonda
                                               SSC Borad

Name: Supriya Kale                                                     Date:21/02/2024
Roll No:3325                                   Sec:D                   Exam:Unit test
------------------------------------------------------------------------------------------------------------------------------
  Subjects                                  total marks                  Obtained marks
_______________________________________________________________________________________________________________________________
  Math                                       100                            92
  English                                    100                            78
  Physics                                    100                            66
  History                                    100                            80
  Chemistry                                  100                            85

 ________________________________________________________________________________________________________________________________

Total                                        500                        Marks obtained:401
Percentage: 80.0                                                        Grade: B
Remark: good                                                            Sign:
_____________________________________________________________________________________________________________________________

       