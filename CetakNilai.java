public class CetakNilai{
	public static void main(String[] args){
	int tahun = 2020;
	char huruf = 'V';
	String nama = "Sahran";
	
	System.out.println("Nilai yang dicetak : ");
	
	print(tahun);
	print(huruf);
	print(nama);
	}
	
	public static <T> void print (T nilai){
		System.out.println(nilai);
	}
}