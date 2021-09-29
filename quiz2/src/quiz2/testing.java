package quiz2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testing {
	
	@Test
	public void test01() {//addpatient
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
		Wards a=new Wards(myhos,true,7);
		a.addpatient(ali);
		a.addpatient(haris);
		assertEquals(8,myhos.bedsavailable);
	}
	@Test
	public void test02() {//addpatient of wrong gender
		patient ali=new patient();
		patient haris=new patient();
		ali.setID(1);
		ali.setname("Ali");
		ali.setgender(true);
		haris.setgender(false);
		haris.setname("Haris");
		haris.setID(2);
		Hospital myhos=new Hospital();
		myhos.name="Maroof";
		myhos.location="ICT";
		myhos.contact=2255089;
		myhos.price=15000;
		myhos.bedsavailable=10;
		myhos.rating=10;
		Wards a=new Wards(myhos,true,7);
		a.addpatient(ali);
		a.addpatient(haris);
		assertEquals(9,myhos.bedsavailable);
	}
	@Test
	public void test03() {//patient data
		patient ali=new patient();
		ali.setID(1);
		ali.setname("Ali");
		ali.setgender(true);
		assertEquals(true,ali.getgender());
	}
	@Test
	public void test04() {//hospital data
		Hospital myhos=new Hospital();
		myhos.name="Maroof";
		myhos.location="ICT";
		myhos.contact=2255089;
		myhos.price=15000;
		myhos.bedsavailable=10;
		myhos.rating=10;
		assertEquals("Maroof",myhos.name);
	}
	@Test
	public void test05() {
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
		myhos.bedsavailable=1;
		myhos.rating=10;
		Wards a=new Wards(myhos,true,7);
		a.addpatient(ali);
		a.addpatient(haris);
		assertEquals(-1,myhos.bedsavailable);
	}
}
