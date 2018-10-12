public class KaryawanTest{

	public static void main(String[] args) {
		Designer j1 = new Designer();
		j1.setNama("Salwa Husnun");
		System.out.println(j1.getnewNama());
		j1.setAlamat("Solo");
		System.out.println(j1.getnewAlamat());
		j1.addGaji(60);
		j1.addGaji(10, "selamat anda mendapatkan bonus gaji");
		j1.addGaji(30);
		System.out.println("\n");
		
		Programmer j2 = new Programmer();
		j2.setNama("Fairuz Zidhni");
		System.out.println(j2.getnewNama());
		j2.setAlamat("Segeran");
		System.out.println(j2.getnewAlamat());
		j2.addGaji(50);
		j2.addGaji(25);
		j2.addGaji(15, "selamat anda mendapatkan bonus gaji");
		j2.addGaji(10);
		System.out.println("\n");

		PM j3 = new PM();
		j3.setNama("Paijo Loyo");
		System.out.println(j3.getnewNama());
		j3.setAlamat("Sindang");
		System.out.println(j3.getnewAlamat());
		j3.addGaji(40);
		j3.addGaji(20);
		j3.addGaji(20);
		j3.addGaji(10);
		j3.addGaji(10, "selamat anda mendapatkan bonus gaji");
		j3.addGaji(30);
		System.out.println("\n");
	}
}
