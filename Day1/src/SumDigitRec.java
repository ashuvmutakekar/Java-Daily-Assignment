import java.util.Scanner;
public class SumDigitRec
{
       public static void digitSum(int Num,int rem)
       {   if(Num!=0)
		   {
           rem+=Num%10;
		   Num=Num/10;
		   digitSum(Num,rem);
		   }
		  else
		  {
			  
			 System.out.println("Sum of digit :"+ rem);
		  }
		  
	   }

   

       
             
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Number :");
   int Num=sc.nextInt();
   SumDigitRec.digitSum(Num,0);
 

 }

}
