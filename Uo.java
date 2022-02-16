//this program show list of mathmatical operations u choice one 
package uo;
import java .util.Scanner ;
public class Uo {

    public static void main(String[] args) {
  Scanner input = new Scanner (System.in );
  int num1 ,num2,i,op;
  //here if u want those numbers fixed in all operations
       System.out.println("input your first number ");
        num1 = input .nextInt();
            System.out.println("input your second number ");
        num2 = input .nextInt();
        
        do {
            // here if u want change your numbers in every operation
            /*
            System.out.println("input your first number ");
        num1 = input .nextInt();
            System.out.println("input your second number ");
        num2 = input .nextInt();*/
      System.out.println("select number ");
            System.out.println("1: add the numbers");
           System.out.println("2: sub the numbers ");
              System.out.println("3: multi the nimbers");
      System.out.println("4: devied numbers");
      System.out.println("0: for exite");
      op=input .nextInt ();
switch (op){
    case 1:
        System.out.println("sum = "+(num1+num2));
        break ;
    case 2:
        
       System.out.println("sub= "+ (num1-num2 ));
           break ;

    case 3:
        System.out.println("multi = "+(num1*num2));
        break ;

    case 4:
        System.out.println("devide ="+(num1/num2));

        break ;
}
        }while (op!=0);






}
      
      
      
      
  
    
   
    
    }
    
    
        }
}

