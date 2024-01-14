import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan Jumlah data yang kan di input = ");
        int jum_data = Integer.parseInt(reader.readLine());
        String [] judul_buku = new String[jum_data];
        for (int index=0; index<judul_buku.length; index++){
            System.out.println("Input Judul Buku  ke " + (index+1)+(" = "));
            String judul = reader.readLine();
            judul_buku[index]= judul;
        }
    }
}
