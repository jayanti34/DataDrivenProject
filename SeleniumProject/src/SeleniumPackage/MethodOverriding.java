package SeleniumPackage;
class Bank{
	int getRateOfInterest() {
		return 5;
	}
}
class SBI extends Bank{
	int getRateOfInterest() {
		return 6;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class Axis extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		Axis a = new Axis();
			
System.out.println("Interest of SBI:"+s.getRateOfInterest());
System.out.println("Interest of ICICI:"+i.getRateOfInterest());
System.out.println("Interest of Axis:"+a.getRateOfInterest());
	}
}






