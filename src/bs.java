import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bs {
    public static void main(String[] args) throws IOException {
        BufferedReader baca = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("msk");
        String judul = baca.readLine();
        System.out.println(judul);
    }
}
