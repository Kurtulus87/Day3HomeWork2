package Day3HomeWork2;

public class Student extends User{
	private String KayitliOlduguKurslar;
	
	public Student() {
		
	}

	public Student(String kayitliOlduguKurslar) {
		super();
		this.KayitliOlduguKurslar = kayitliOlduguKurslar;
	}

	public String getKayitliOlduguKurslar() {
		return KayitliOlduguKurslar;
	}

	public void setKayitliOlduguKurslar(String kayitliOlduguKurslar) {
		KayitliOlduguKurslar = kayitliOlduguKurslar;
	}
}

