package bank;

public class Main {
	public static void main(String args[]) {
		AkunBank akunBank1 = new AkunBank();
		akunBank1.setNoRek("1710099");
		akunBank1.setNama("Dhani");
		akunBank1.setJenisKelamin("Laki-laki");
		akunBank1.setAlamat("Mejayan");
		akunBank1.setSaldo(10000000);
		
		System.out.println("Nama Akun 1 " + akunBank1.getNama());
		
		AkunBank akunBank2 = new AkunBank("1710099", "Dhani", "Laki-laki", "Alamat", 10000000);
		System.out.println("Saldo " + akunBank2.getNama() + " adalah " + akunBank2.getSaldo());
		akunBank2.ambilUang(5000000);
		System.out.println("Sisa Saldo =" + akunBank2.getSaldo());
	}
}
