
package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.JOptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author Ayen Yehan
 * TGL : 15 Maret 2025
 */
import java.io.InputStreamReader;
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String mhs="Archangela Chirani Yehan";
       long nim=2301010312L; 
       String kelas ="A";
       
       BufferedReader dtIN = new BufferedReader(new InputStreamReader (System.in));
       try{
           System.out.print("Input Nama Mahasiswa: ");
           mhs = dtIN.readLine();
           
           System.out.print("Input NIM:");
           nim = Long.parseLong(dtIN.readLine());
           
       }catch(IOException e){
           System.out.println("Terjadi masalah saat ini");
       }   
       
       kelas = JOptionPane.showInputDialog("Input kelas: ");
       
       System.out.println("Data"+mhs+ "Berada di kelas  "+kelas);
       System.out.print("NIM "+nim);
    
       
       //System.out.println("Data "+mhs+" dengan NIM "+ nim);
       //System.out.print(nim);
    }
   
}
