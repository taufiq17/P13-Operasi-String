public class CreateKode1{
	
	static String tahun_ajaran = "2017-2018";
	static String semester = "Gasal"; // terdapat menggunakan IF ELse 
	static String kd_prodi = "153";
	static String kode = "";

	public static  void set_kode2(){
		String ta1 = tahun_ajaran.substring(2, 4);
		String ta2 = tahun_ajaran.substring(7, 9);
		

		if (semester.equals("Gasal")){
			semester = "1";

		}else{
			semester = "2";

		}
		kode = ta1 + ta2 + semester + kd_prodi ;
		System.out.println("Kode : \t" +kode);
	
		for(int i=1;i<=20; i++){
			if(i<=9){
				System.out.println("Kode = "+ta1 + ta2 + semester + kd_prodi+"0"+i);

			}else{
				System.out.println("Kode = "+ta1 + ta2 + semester + kd_prodi+i);

			}
			
		}
	}
	public static void main (String[] args){
				set_kode2();
			}
}