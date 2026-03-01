import java.util.Scanner;

public class  Main {
   static Scanner myObj = new Scanner(System.in);
    /////////////////////////////////////////////// SHIFTING METHOD
    static void Shift(int E_D){
        System.out.println("Please enter the message: ");
        String name = myObj.nextLine();
        System.out.println("Please enter the size of shifting: ");
        int size = myObj.nextInt();
        myObj.nextLine();
        char[] ar = name.toCharArray();
        for(int i = 0 ; i < ar.length; i++){
            if (E_D == 1) {ar[i] += size;}
            if (E_D == 2) {ar[i] -= size;}
        }
        name = new String (ar);
        System.out.println(name);
    }
    ///////////////////////////////////////////////XOR_KEY METHOD
    static void XorCipher() {
        System.out.println("Please enter the message: ");
        String name = myObj.nextLine();

        System.out.println("Please enter a secret key (a small number): ");
        int key = myObj.nextInt();
        myObj.nextLine();

        char[] ar = name.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (char) (ar[i] ^ key);
        }

        String result = new String(ar);
        System.out.println(result);
    }
///////////////////////////////////////////////////////////////////////////////////////////// Main////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("1. Encrypt \n2. Decrypt");
        int E_D = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Select the Method Encryption or Decryption");
        System.out.println("1. Shifting Method \n2. Xor_key Method");
        int S_X = myObj.nextInt();
        myObj.nextLine();
        if (S_X == 1){
            Shift(E_D);
        }
        else if (S_X == 2) {
            XorCipher();
        }

    }
}