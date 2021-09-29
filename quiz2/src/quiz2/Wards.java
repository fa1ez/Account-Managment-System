package quiz2;

public class Wards extends patient{

	public Hospital hos;
	private boolean gender;
	public int capacity;
	public patient p[];
	
	public Wards(Hospital c,boolean a,int b) {
		hos=c;
		gender=a;
		capacity=b;
		p=new patient[b];
	}
	public boolean getgender() {
		return gender;
	}
	public int bedsavaiable() {
		return hos.bedsavailable;
	}
	public void addpatient(patient a) {
		if(this.gender==a.getgender()) {
			for(int i=0;i<capacity;i++) {
				if(p[i]==null) {
					p[i]=a;
					hos.bedsavailable--;
					break;
				}
			}
		}
		else {
			//throw exception here
			System.out.println("Wrong gender");
		}
	}
}
