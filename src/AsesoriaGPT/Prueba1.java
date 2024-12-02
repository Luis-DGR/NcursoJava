package AsesoriaGPT;
import java.io.FileInputStream;
public class Prueba1 {
    public static void main(String[] args) {


     try {
        // Crea un FileInputStream
        FileInputStream entrada = new FileInputStream("C:\\Users\\David\\Desktop\\NuevoxD.txt");

        // Lee el archivo byte por byte
        int byteLeido;
        while ((byteLeido = entrada.read()) != -1) {
            System.out.print((char) byteLeido);
        }

        // Cierra el stream
        entrada.close();
    } catch (Exception e) {
        System.out.println("Ocurrió un error: " + e.getMessage());
    }
}
}

