
import java.util.Scanner;

public class tugasBioskop03 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int total=0, hargaTiket=50000, jmltiket, totalTiket=0;
        System.out.println("=================================");
        System.out.println("---- Penjualan Tiket Bioskop ----");
        System.out.println("=================================");
        do { 
            System.out.print("Jumlah tiket yang dibeli(ketik '0' jika selesai): ");
            jmltiket=sc.nextInt();
            
            if(jmltiket<0){
                System.out.println("Input tidak valid");
                continue;
            }
            totalTiket+=jmltiket;
            if(jmltiket>10){
                total+=hargaTiket*jmltiket-(jmltiket*hargaTiket*0.15);
            }else if(jmltiket>4){
                total+=hargaTiket*jmltiket-(jmltiket*hargaTiket*0.1);
            }else{
                total+=hargaTiket*jmltiket;
            }
        } while (jmltiket!=0);
        System.out.println("----------------------------------");
        System.out.println("total Tiket yang terjual: "+totalTiket);
        System.out.println("Total pendapatan dalam sehari:Rp."+total);
        System.out.println("----------------------------------");
    }
    
}
