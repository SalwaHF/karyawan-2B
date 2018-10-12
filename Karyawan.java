public class Karyawan{
	private String nama;
	private String alamat;
	protected int gaji = 0;
	final int maksGajiDesigner = 70;
	final int maksGajiProgrammer = 90;
	final int maksGajiPM = 100;

	public void addGaji(int newGaji, String pesan){
		gaji += newGaji;
		System.out.println("Gaji yang diperoleh = " + gaji);
		System.out.println("Pesan = ");
	}

	public void setNama(String newNama){
		nama = newNama;
	}

	public void setAlamat(String newAlamat){
		alamat = newAlamat;
	}

	public String getnewNama(){
		return nama;
	}

	public String getnewAlamat(){
		return alamat;
	}
}
