import java.util.Scanner;

public class FullSubtractor {
    static int inputBit(Scanner sc, String msg){
        int bit = -1;
        while(true){
            try{
                System.out.print(msg);
                bit = sc.nextInt();
                if(bit == 0 || bit == 1){
                    return bit;
                }else{
                    System.out.println("Invalid Input. Please enter 0 or 1.");
                }
            }catch(Exception e){
                System.out.println("Invalid input type. Please enter a integer value (0 or 1).");
                sc.nextLine();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = inputBit(sc, "Enter first bit(A) (0 or 1)    :");
        int B = inputBit(sc, "Enter second bit(B) (0 or 1)   :");
        int C = inputBit(sc, "Enter third bit(C-in) (0 or 1) :");

        int diff = (A ^ B) ^ C;                          // XOR operation (Diff = A ⊕ B ⊕ C)
        int borrow = ((~A & B) | (~A & C) | (B & C));    // Borrow = (!A & B) + (!A & C) + (B & C)

        System.out.println("\n<-<-- Full Subtractor Output -->->\n");
        System.out.println("++==================================++");
        System.out.println("||  A  |  B  |  C  | Diff. | Borrow ||");
        System.out.println("||----------------------------------||");
        System.out.println("||  "+A+"  |  "+B+"  |  "+C+"  |   "+diff+"   |   "+borrow+"    ||");
        System.out.println("++==================================++");

        sc.close();     
    }
}
