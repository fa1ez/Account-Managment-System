package quiz2;

public class Main {
	public static void main(String[] args) {
		
		patient ali=new patient();
		patient haris=new patient();
		ali.setID(1);
		ali.setname("Ali");
		ali.setgender(true);
		haris.setgender(true);
		haris.setname("Haris");
		haris.setID(2);
		
		Hospital myhos=new Hospital();
		myhos.name="Maroof";
		myhos.location="ICT";
		myhos.contact=2255089;
		myhos.price=15000;
		myhos.bedsavailable=10;
		myhos.rating=10;
		myhos.PrintHospitalData();
		
		Wards a=new Wards(myhos,true,7);
		if(a.getgender())
			System.out.println("\nWard type: male");
		else
			System.out.println("\nWard type: female");
		
		
	}
}
