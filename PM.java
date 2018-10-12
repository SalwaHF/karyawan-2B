public class PM extends Karyawan{
	public void addGaji(int newGaji){
		System.out.println("Gaji yang diperoleh = " + gaji);
		if ((gaji + newGaji) <= maksGajiPM){
			gaji += newGaji;
			System.out.println("Bonus Gaji = " + newGaji);
			System.out.println("Total Gaji = " + gaji);
		} else{
			gaji = maksGajiDesigner;
			System.out.println("Gaji yang diperoleh melebihi batas maksimal");
		}
	}

	public void addGaji(int newGaji, String pesan){
		System.out.println("Gaji yang diperoleh = " + gaji);
		if ((gaji + newGaji) <= maksGajiPM){
			gaji += newGaji;
			System.out.println("Bonus Gaji = " + newGaji);
			System.out.println("Total Gaji = " + gaji);
			System.out.println(pesan);
		} else{
			gaji = maksGajiPM;
			System.out.println("Gaji yang diperoleh melebihi batas maksimal");
		}
	}
}
