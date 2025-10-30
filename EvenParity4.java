import java.util.*;

class EvenParity4 {

    static int input(Scanner sc){
        int bit = -1;
       while(true){

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

        int msg[] = new int[4];
        System.out.println("Enter 4 bits of message code :");
        for(int i = 0;i < 4; i++){
            msg[i] = input(sc);
        }

        System.out.print("Message code : ");
        for(int i = 0;i < 4; i++){
            System.out.print(msg[i] + " ");
        }

        System.out.println("\nLength of message code(n)   : 4");
        System.out.println("Number of parity bit(k)     : 3");
        System.out.println("Length of Hamming Code(n+k) : 7");

        int Hamming[] = new int[7];
        int p1=0,p2=0,p3=0;

        p1 = (msg[0] + msg[1] + msg[3]) % 2;
        p2 = (msg[0] + msg[2] + msg[3]) % 2;
        p3 = (msg[1] + msg[2] + msg[3]) % 2;

        Hamming[0] = p1;
        Hamming[1] = p2;
        Hamming[3] = p3;

        int n = 0;
        for (int i = 0; i <= 6; i++) {
            if(i == 0 || i == 1 || i == 3){
                continue;
            }
                Hamming[i] = msg[n++];
            
        }

        System.out.print("Hamming code : ");
        for(int i = 0;i < 7; i++){
            System.out.print(Hamming[i] + " ");
        }
        sc.close();
    }
}