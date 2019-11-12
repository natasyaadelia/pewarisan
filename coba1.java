import java.util.Scanner;
public class coba1 extends coba{
    private int jumlah;
    Scanner input = new Scanner(System.in);
    public coba1(int merk, int kategori, int jenis, int warna, int size, int jumlah){
        super.coba(merk,kategori,jenis,warna,size);
        System.out.print("Berapa jumlah yang anda inginkan? : ");
        this.jumlah = jumlah = input.nextInt();
        if(this.jumlah == 1){
            super.cetak();
        }else if(this.jumlah == 2){
            super.cetak2();
        }else if(this.jumlah == 3){
            super.cetak3();
        }else{
            super.cetak();
        }
    }
}
