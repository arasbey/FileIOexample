/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Calisma
 */
public class JavaApplication1 {

    public static void main(String[] args) {

       //DosyayaEkle("Allbod");
        //DosyayaEkle("Nobody");
        dosyadanOku();

    }

    private static void DosyayaEkle(String metin) {
        try {
            File dosya = new File("C:\\test\\test.txt");
            FileWriter yazici = new FileWriter(dosya, false);
            BufferedWriter yaz = new BufferedWriter(yazici);
            yaz.write(metin);
            yaz.close();
            System.out.println("Ekleme İşlemi Başarılı");
        } catch (Exception hata) {
            hata.printStackTrace();
        }
    }

    private static void dosyadanOku() {
        try {
            File dosya = new File("C:\\test\\test.txt");
            FileReader okuyucu = new FileReader(dosya);
            String line;
            
            BufferedReader br = new BufferedReader(okuyucu);
            while((line = br.readLine()) != null){
                if(line.equals("Nobody")){
                    System.out.println("Not Girildi");
                }
                else{
                    System.out.println(line);
                }
            }
            
        } catch (Exception e) {

        }

    }

}
