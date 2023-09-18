package encapsulation;

class Pasien{
	
	// Set attributes
	String nama, penyakit;
	int umur;
	
	// Getter nama pasien
	public String getNama() {
		return nama;
	}
	
	// Setter nama pasien
	public void setNama(String newNama) {
	    this.nama = newNama;
	}
	
	// Getter nama penyakit
	public String getPenyakit() {
		return penyakit;
	}
	
	// Setter nama penyakit
	public void setPenyakit(String newPenyakit) {
		this.penyakit = newPenyakit;
	}
	
	// Getter umur
	public int getUmur() {
		return umur;
	}
	
	// Setter public void setUmur
	public void setUmur(int newUmur) {
		this.umur = newUmur;
	}
	
}

// Main class
class Main{
	
	// Main method
	public static void main(String args[]) {
		
		// Init object pasien
		Pasien Obj = new Pasien();
		
		// Set nama, penyakit, umur
		Obj.setNama("Galih Anggoro Prasetya.");
		Obj.setPenyakit("Tidak Ada Penyakit.");
		Obj.setUmur(19);
		
		// Get nama, penyakit, umur
		System.out.println(Obj.getNama());
		System.out.println(Obj.getPenyakit());
		System.out.println(Obj.getUmur());
	}
}
