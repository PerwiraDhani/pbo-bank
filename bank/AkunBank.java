package bank;

public class AkunBank {
	String noRek, nama, jenisKelamin, alamat;
	int saldo;
	public AkunBank(String noRek, String nama, String jenisKelamin, String alamat, int saldo) {
		this.noRek = noRek;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
		this.saldo = saldo;
	}
	
	public AkunBank() {
		
	}
	
	public void setNoRek(String noRek) {
		this.noRek = noRek;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public void ambilUang(int besar) {
		this.saldo = saldo-besar;
	}
	public void simpan(int besar) {
		this.saldo = saldo+besar;
	}
	public String getnoRek() {
		return noRek;
	}
	public String getNama() {
		return nama;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public String alamat() {
		return alamat;
	}
	public int getSaldo() {
		return saldo;
	}
}
