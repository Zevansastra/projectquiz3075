import java.util.Scanner;
public class Main_3075 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa_3075 mahasiswa_3075_1 = new Mahasiswa_3075();
        Mahasiswa_3075 mahasiswa_3075_2 = new Mahasiswa_3075();
        Dosen_3075 dosen_3075_1 = new Dosen_3075();
        Dosen_3075 dosen_3075_2 = new Dosen_3075();

        System.out.println("NIK                 : ");
        mahasiswa_3075_1.nik_3075 = input.next();
        System.out.println("Nama                : ");
        mahasiswa_3075_1.nama_3075 = input.next();
        System.out.println("Umur                : ");
        mahasiswa_3075_1.umur_3075 = input.nextInt();
        System.out.println("Alamat              : ");
        mahasiswa_3075_1.alamat_3075 = input.next();
        System.out.println("NIM                 : ");
        mahasiswa_3075_1.nim_3075 = input.next();
        System.out.println("IPK                 : ");
        mahasiswa_3075_1.ipk_3075 = input.nextInt();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        mahasiswa_3075_2.nik_3075 = input.next();
        System.out.println("Nama                : ");
        mahasiswa_3075_2.nama_3075 = input.next();
        System.out.println("Umur                : ");
        mahasiswa_3075_2.umur_3075 = input.nextInt();
        System.out.println("Alamat              : ");
        mahasiswa_3075_2.alamat_3075 = input.next();
        System.out.println("NIM                 : ");
        mahasiswa_3075_2.nim_3075 = input.next();
        System.out.println("IPK                 : ");
        mahasiswa_3075_2.ipk_3075 = input.nextInt();
        

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA MAHASISWA");
        mahasiswa_3075_1.tampilDataBeasiswa_3075();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        mahasiswa_3075_2.tampilDataMahasiswa_3075_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3075_1.nik_3075 = input.next();
        System.out.println("Nama                : ");
        dosen_3075_1.nama_3075 = input.next();
        System.out.println("Umur                : ");
        dosen_3075_1.umur_3075 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3075_1.alamat_3075 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3075_1.nidn_3075 = input.next();
        System.out.println("Golongan                 : ");
        dosen_3075_1.gol_3075 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3075_1.gajiPokok_3075);
        // dosen_3075_1.gajiPokok_3075 = input.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("NIK                 : ");
        dosen_3075_1.nik_3075 = input.next();
        System.out.println("Nama                : ");
        dosen_3075_1.nama_3075 = input.next();
        System.out.println("Umur                : ");
        dosen_3075_1.umur_3075 = input.nextInt();
        System.out.println("Alamat              : ");
        dosen_3075_1.alamat_3075 = input.next();
        System.out.println("NIDN                 : ");
        dosen_3075_1.nidn_3075 = input.next();
        System.out.println("Golongan                 : ");
        dosen_3075_1.gol_3075 = input.next();
        System.out.println("Gaji Pokok              : " + dosen_3075_2.gajiPokok_3075);
        // dosen_3075_1.gajiPokok_3075 = input.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("DATA DOSEN");
        dosen_3075_1.tampilDataDosen_3075_1();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        dosen_3075_2.tampilDataDosen_3075_2();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        

        

    }
}
