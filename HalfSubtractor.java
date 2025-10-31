import java.util.Scanner;

public class HalfSubtractor {
    static int input(Scanner sc, String msg){
        int bit = -1;
      
       while(true){
            System.out.print(msg);

            try{
                bit = sc.nextInt();
                if(bit == 0 || bit == 1){
                    return bit;
                }
                else{
                    System.out.println("Invalid Input. Please enter 0 or 1. \n");
                }
            }catch(Exception e){
                System.out.println("Invalid input type. Please enter a integer value (0 or 1).\n");
                sc.nextLine(); // clear the invalid input from the buffer
            }
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = input(sc, "Enter first bit (0 or 1)  :");
        int B = input(sc, "Enter second bit (0 or 1) :");
        
        // Half Subtractor Logic
        int diff = A ^ B;       // Difference = A XOR B
        int borrow = (~A) & B;  // Borrow = NOT A AND B

        System.out.println("\n<-<-- Half Subtractor Output -->->\n");
        System.out.println("++===========================++");
        System.out.println("||  A  |  B  |  SUM  | CARRY ||");
        System.out.println("||---------------------------||");
        System.out.println("||  "+A+"  |  "+B+"  |   "+diff+"   |   "+borrow+"   ||");
        System.out.println("++===========================++");

        sc.close();
    }
}
