package bank;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int pilihan;
	AkunBank akunBank1 = new AkunBank();
	System.out.print("Nama : ");
	String nama = in.nextLine();
	akunBank1.setNama(nama);
	
	System.out.print("Saldo : ");
	int saldo = in.nextInt();
	akunBank1.setSaldo(saldo);
	
	
	do{System.out.println("1. Cek Saldo");
	System.out.println("2. Simpan");
	System.out.println("3. Tarik Tunai");
	System.out.println("4. Exit");
    
    System.out.print("Masukkan pilihan anda : ");
    pilihan = in.nextInt();
    switch(pilihan){
        case 1 : 
		System.out.println("Nama Akun : " + akunBank1.getNama());
		System.out.println("Saldo : " + akunBank1.getSaldo());
		System.out.println();
		;break;
        case 2 : 
        System.out.print("Masukkan nominal : ");
		int besar1 = in.nextInt();
		akunBank1.simpan(besar1);
		System.out.println("Sisa Saldo = " + akunBank1.getSaldo());
		System.out.println();
		;break;
        case 3 : 
        System.out.print("Masukkan nominal : ");
    	int besar2 = in.nextInt();
    	akunBank1.ambilUang(besar2);
    	System.out.println("Sisa Saldo = " + akunBank1.getSaldo());
    	System.out.println();
        break;
        case 4 : 
        System.exit(0);
        break;
        }
	}while (pilihan != 4);
	//inp.close();
	}
	
	/*public static void Saldo() {
		Scanner in = new Scanner(System.in);
		AkunBank akunBank1 = new AkunBank();
		
		
		System.out.println("Nama Akun : " + akunBank1.getNama());
		System.out.println("Saldo : " + akunBank1.getSaldo());
		System.out.println();
	}*/
	
	/*public static void Deposit() {
		Scanner in = new Scanner(System.in);
		AkunBank akunBank1 = new AkunBank();
		
		System.out.print("Masukkan nominal : ");
		int besar = in.nextInt();
		akunBank1.simpan(besar);
	}*/
	
	/*public static void Penarikan() {
		Scanner in = new Scanner(System.in);
		AkunBank akunBank1 = new AkunBank();
		
		System.out.print("Masukkan nominal : ");
		int besar = in.nextInt();
		akunBank1.ambilUang(besar);
	}*/
	
	/*public static void exit() {
		System.exit(0);
	}*/
}
