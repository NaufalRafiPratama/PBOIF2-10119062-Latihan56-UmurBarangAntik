/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * umur barang antik
 */
public class PBOIF210119062Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Radio objRadio = new Radio(234);
        objRadio.setName("Radio AM");
        
        System.out.println("Nama Barang Antik : "+objRadio.getName());
        objRadio.tampilUmur();
    }
    
}
