
package budi07154_sewaapartemen;

public class Budi07154_CustomerEntity {
  String nama;
            int berapaHari;
            double harga,hargabayar,kembalian;

    public String getNama() {
        return nama;
    }

    public int getBerapaHari() {
        return berapaHari;
    }

    public double getHarga() {
        return harga;
    }

    public double getHargabayar() {
        return hargabayar;
    }

    public double getKembalian() {
        return kembalian;
    }

    public Budi07154_CustomerEntity(String nama, int berapaHari, double harga, double hargabayar, double kembalian) {
        this.nama = nama;
        this.berapaHari = berapaHari;
        this.harga = harga;
        this.hargabayar = hargabayar;
        this.kembalian = kembalian;
    }
   
}  
