import java.util.Scanner;

public class Stackoperation{
    public static void main (String[]args){
      Scanner sc=new Scanner(System.in);
        int maxsize=5;
        int  tos=-1;
        int arr[]= new int[maxsize];
        
        while (true) {
        System.out.println(" click 1 for push:");
        System.out.println(" click 2 for pop:");
        System.out.println(" click 3 for display:");
        System.out.println(" click 4 for exit:");

        System.out.println("Enter your choice");
        int number=sc.nextInt();

       
        
       
        switch(number){
          case 1:
            if(tos==maxsize-1){
              System.out.println("Stack overflow");
               
            }
            else{
              tos=tos+1;
              System.out.println("Enter the data");
              int data = sc.nextInt();
              arr[tos]=data;
            }
             break;
            case 2:
              if(tos==-1){
                System.out.println("STACK IS UNDERFLOW");

              }
              else{
                
                int data=arr[tos];
                System.out.println(data+"deleted");
                tos=tos-1;
              }
              break;
            case 3:
            if(tos==-1){
              System.out.println("Stack is underflow");
            }
            else{
              for(int i=0;i<=tos;i++){
                System.out.println(arr[i]);
              }
            }
            break;
            case 4:
                return;
                
             default:
             System.out.println("your number is incorret");   
            
        }
         
        
    }}
}