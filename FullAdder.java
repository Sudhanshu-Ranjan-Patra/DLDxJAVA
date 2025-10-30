import java.util.*;

public class FullAdder {

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

        int sum = (A ^ B) ^ C;      // XOR operation (S = A ⊕ B ⊕ C-IN)
        int carry = (A & B) + (C & (A ^ B));    // AND operation (A B + C-IN (A ⊕ B))

        System.out.println("\n<-<-- Full Adder Output -->->\n");
        System.out.println("++=================================++");
        System.out.println("||  A  |  B  |  C  |  SUM  | CARRY ||");
        System.out.println("||---------------------------------||");
        System.out.println("||  "+A+"  |  "+B+"  |  "+C+"  |   "+sum+"   |   "+carry+"   ||");
        System.out.println("++=================================++");

        sc.close();     
    }
}
