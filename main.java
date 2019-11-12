import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        boolean aku = true;
        Scanner input = new Scanner(System.in);
        while(aku){
            coba1 aja = new coba1(0,0,0,0,0,0);
            System.out.print("Apakah anda ingin beli lagi?\n : ");
            String jawab = input.next();
            if(jawab.equalsIgnoreCase("tidak")){
                aku = false;
            }
        }
    }
}
