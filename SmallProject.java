
class SmallProject
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);

int key1=1;
switch(key1)
{
case 1:System.out.println("choose college");
       
       int key2=1;
       switch(key2)
       {
        case 1:System.out.println("Place of college");
               int percentage=75;
               char grade='A';
                int key3=2;
                switch(key3)
                          {
                           case 1: if(percentage >=50 || grade=='A')
                                    {
                                     System.out.println("congrats you can get college in native place");
                                    }
                                       else{
                                            System.out.println("sorry you cannot get college in native place");
                                            }
                                            break;
                             case 2: if(percentage>60 || grade=='A' || grade=='B')
                                   {
                                     System.out.println("congrats you can get college in India");
                                   }
                                   else{
                                        System.out.println("sorry you cannot get college in India");
                                       }
                                       break;
                              case 3:if(percentage>90 && grade=='A')
                                   {
                                     System.out.println("congrats you can get college in world");
                                   }
                                   else{
                                        System.out.println("sorry you cannot get college in world");
                                       }
                                       break;
                              case 4:if(percentage>35)
                                   {
                                     System.out.println("congrats you can get college in remote");
                                   }
                                   else{
                                        System.out.println("sorry you cannot get college in remote");
                                       }
                                       break;
                             }      

         }
}
}
} 

//Output
Compile time-Success
Run time-Success
choose college
Place of college
congrats you can get college in India

        