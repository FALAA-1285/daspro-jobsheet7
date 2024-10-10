
import java.util.Scanner;

public class tugasParkir {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int jenis, durasi, total=0;

        System.out.println("================================");
        System.out.println("--- Progam Pembayaran Parkir ---");
        System.out.println("================================");
        do { 
            System.out.println("jenis kendaraan");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis=sc.nextInt();
            if(jenis==1||jenis==2){
                System.out.print("Masukkan durasi: ");
                durasi=sc.nextInt();
                if(durasi>5){
                    total+=12500;
                }
                if(jenis==1){
                    total+=durasi*3000;
                }else if(jenis==2){
                    total+=durasi*2000;
                }
            }else if(jenis!=0){
                System.out.println("Input Tidak Valid");
            }
        } while (jenis!=0);
        System.out.println("Total pendapatan "+total);
        System.out.println("---------------------------");
    }
}
    
