import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohMethod {
    public static void main(String[] args) throws IOException {
            CetakJudul();
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan Angka 1: ");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Masukan Angka 2: ");
        int y = Integer.parseInt((reader.readLine()));
        System.out.println(x+y);

        System.out.println("Hitung Penjumlahan Dua Angka Menggunakan Method ");
        
        JumlahDuaAngka();
        Jumlah_Method2(x,y);
        int hasil = Jumlah_Method3();
        System.out.println(hasil);
        String hasilku = GanjilGenap(hasil,"Kelas 1C");
        System.out.println("Method  ke 4 --- >  " + hasilku);

    }
    private static  void CetakJudul(){
        System.out.println("Contoh Penjumlahan Dua angka  TANPA Mengunakan Method");
    }
    private static int Jumlah_Method3() throws IOException{
     BufferedReader baca= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Number1 : ");
        int number1 = Integer.parseInt(baca.readLine());
        System.out.println("Masukkan Number2 : ");
        int number2 = Integer.parseInt((baca.readLine()));
        return  number1+number2;
    }
    private  static  String GanjilGenap(int angka,String nama){
        String ahir=null;
        if (angka % 2 ==0) {
            ahir = "genap";
        }else {
            ahir = "Ganjil";
        }
        return  nama + " = " + ahir;
    }
    private  static  void Jumlah_Method2(int number1,int number2){
        System.out.println(number1+number2);}

    private static  void JumlahDuaAngka() throws IOException {
        BufferedReader baca= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Number1 : ");
        int number1 = Integer.parseInt(baca.readLine());
        System.out.println("Masukkan Number2 : ");
        int number2 = Integer.parseInt((baca.readLine()));
        System.out.println(number1+number2);
    }
}
