
package budi07154_sewaapartemen;
  import java.util.ArrayList;
    import java.util.Scanner;
public class Budi07154_sewaapartemen {
 static ArrayList <Budi07154_CustomerEntity> dataCustomer = new ArrayList();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
 int pil;
    do{
        System.out.println("Sewa Apartemen Project!");
        System.out.println("1. Input ");
        System.out.println("2. View ");
        System.out.println("3. Update ");
        System.out.println("4. Delete ");
        System.out.println("0. Exit ");
        System.out.println("Pilih :");
        pil = input.nextInt();
                switch(pil){
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
            }
        }while(pil!=0);
    }
    static void input(){
        System.out.print("Namamu ? ");
        String nama = input.next();
        System.out.print("Sewa Berapa Hari : ");
        int berapahari = input.nextInt();
        System.out.print("Harga : ");
        Double harga = input.nextDouble();
        System.out.print("Pembayaran : ");
        Double hargabayar = input.nextDouble();
        Double kembali = hargabayar - (harga*berapahari);
        dataCustomer.add(new Budi07154_CustomerEntity(nama,berapahari,harga,hargabayar,kembali));
    }
    static void view(){
        if (dataCustomer.size()==0){
            System.out.println("Data Kosong!");
        }else {
            for(int i=0;i<dataCustomer.size();i++){
                System.out.println("nama = "+dataCustomer.get(i).getNama());
                System.out.println("berapahari ? "+dataCustomer.get(i).getBerapaHari());
                System.out.println("harga = "+dataCustomer.get(i).getHarga());
                System.out.println("total = "+dataCustomer.get(i).getHarga()*dataCustomer.get(i).getBerapaHari());
                System.out.println("pembayaran = "+dataCustomer.get(i).getHargabayar());
                System.out.println("kembalian = "+dataCustomer.get(i).getKembalian());
        }
        }   
    }
    static void update(){
        System.out.println("index ke ");
        int index = input.nextInt();
        System.out.print("Namamu ? ");
        String nama = input.next();
        System.out.print("Cetak Berapa Hari : ");
        int berapahari = input.nextInt();
        System.out.print("Harga : ");
        Double harga = input.nextDouble();
        System.out.print("Pembayaran : ");
        Double hargabayar = input.nextDouble();
        Double kembali = hargabayar - (harga*berapahari);
        dataCustomer.set(index,new Budi07154_CustomerEntity(nama,berapahari,harga,hargabayar,kembali));
    }
    static void delete(){
        System.out.println("index ke ");
        int index = input.nextInt();
        dataCustomer.remove(index);
    }
    
}
