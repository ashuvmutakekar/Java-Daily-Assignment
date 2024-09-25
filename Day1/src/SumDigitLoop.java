import java.util.Scanner;
public class SumDigitLoop
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Number :");
   int Num=sc.nextInt();
   int rem=0;
   while(Num!=0)
   {  
    rem+=Num%10;
    

     Num=Num/10;

    
     
   }
   System.out.println("Additionof digit :" +rem);
 
 }

}
