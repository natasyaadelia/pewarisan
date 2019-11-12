
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class coba {
    private String merk;
    private String kategori;
    private String jenis;
    private String warna;
    private int size;
    private int harga;
    Scanner input = new Scanner(System.in);
    public void coba(int merk, int kategori, int jenis, int warna, int size){
        
        System.out.print("[1] 910\t[2] Adidas\t[3] Nike\t[4] Fila\t[5] Reebok\t[6] Vans\n Masukkan pilihan anda : ");
        merk = input.nextInt();
        if(merk == 1){
            this.merk = "910";
            harga = 500000;
        }else if(merk == 2){
            this.merk = "Adidas";
            harga = 900000;
        }else if(merk == 3){
            this.merk = "Nike";
            harga = 700000;
        }else if(merk == 4){
            this.merk = "Fila";
            harga = 600000;
        }else if(merk == 5){
            this.merk = "Reebok";
            harga = 450000;
        }else if(merk == 6){
            this.merk = "Vans";
            harga = 650000;
        }
        System.out.print("[1] Cowok\t[2] Cewek\n Masukkan pilihan anda : ");
        jenis = input.nextInt();
        if(jenis == 1){
            this.jenis = "Cowok";
        }else if(jenis == 2){
            this.jenis = "Cewek";
        }
        System.out.print("[1] Olahraga\t[2] Lari\t[3] Santai\t[4] Kantoran\n Masukkan pilihan anda : ");
        kategori = input.nextInt();
        if(kategori == 1){
            this.kategori = "Olahraga";
        }else if(kategori == 2){
            this.kategori = "Lari";
        }else if(kategori == 3){
            this.kategori = "Santai";
        }else if(kategori == 4){
            this.kategori = "Kantoran";
        }
        System.out.print("[1] Merah\t[2] Biru\t[3] Putih\t[4] Hitam\t[5] Gold\nMasukkan pilihan anda : ");
        warna = input.nextInt();
        if(warna == 1){
            this.warna = "Merah";
        }else if(warna == 2){
            this.warna = "Biru";
        }else if(warna == 3){
            this.warna = "Putih";
        }else if(warna == 4){
            this.warna = "Hitam";
        }else if(warna == 5){
            this.warna = "Gold";
        }
        System.out.print("Berapa size yang anda inginkan(24 - 34)\n : ");
        this.size = size = input.nextInt();
    }
    public void cetak(){
        System.out.println("----------------JAYA BARU----------------");
        System.out.println("Tanggal\t "+getTanggal());
        System.out.println("Waktu\t "+getWaktu());
        System.out.println("-----------------------------------------");
        System.out.println("Merk sepatu\t  "+this.merk);
        System.out.println("Kategori sepatu\t "+this.kategori);
        System.out.println("Jenis sepatu\t  "+this.jenis);
        System.out.println("Warna sepatu\t  "+this.warna);
        System.out.println("Size sepatu\t  "+this.size);
    }
    public void cetak2(){
        System.out.println("----------------JAYA BARU----------------");
        System.out.println("Tanggal\t "+getTanggal());
        System.out.println("Waktu\t "+getWaktu());
        System.out.println("-----------------------------------------");
        System.out.println("Merk sepatu\t  "+this.merk);
        System.out.println("Kategori sepatu\t  "+this.kategori);
        System.out.println("Jenis sepatu\t  "+this.jenis);
        System.out.println("Warna sepatu\t  "+this.warna);
        System.out.println("Size sepatu\t  "+this.size);
        System.out.println("Harga sepatu\t  "+this.harga);
        int temp;
        temp = this.harga*2-50000;
        this.harga = temp;
        System.out.println("Selamat anda mendapatkan diskon sebesar Rp 50000");
        System.out.println("Total harga\t  "+this.harga);
    }
    public void cetak3(){
        System.out.println("----------------JAYA BARU----------------");
        System.out.println("Tanggal\t "+getTanggal());
        System.out.println("Waktu\t "+getWaktu());
        System.out.println("-----------------------------------------");
        System.out.println("Merk sepatu\t  "+this.merk);
        System.out.println("Kategori sepatu\t  "+this.kategori);
        System.out.println("Jenis sepatu\t  "+this.jenis);
        System.out.println("Warna sepatu\t  "+this.warna);
        System.out.println("Size sepatu\t  "+this.size);
        System.out.println("Harga sepatu\t  "+this.harga);
        int temp;
        temp = this.harga*3-100000;
        this.harga = temp;
        System.out.println("Selamat anda mendapatkan diskon sebesar Rp 100000");
        System.out.println("Total harga\t  "+this.harga);
    }
    private String getTanggal(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }
    private String getWaktu(){
        DateFormat dateFormat = new SimpleDateFormat("HH/mm/ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
