package quiz2;

public class Hospital {

	public String name;
	public String location;
	public int rating;
	public int contact;
	public int price;
	public int bedsavailable;
	
	/* Hospital(String a,String b, int c,int d, int e,int f) {
		name=a;
		location=b;
		rating=c;
		contact=d;
		price=e;
		bedsavailable=f;
	}*/
	public void PrintHospitalData() {
		System.out.println("Name: "+ this.name+ "\nLocation: "+location+"\nRating: "+this.rating+"\nContact: "+this.contact+"\nPrice per bed: "+this.price+"\nBeds available: "+this.bedsavailable);
	}
}
