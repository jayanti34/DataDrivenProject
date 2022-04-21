package SeleniumPackage;

public class elseif {

	public static void main(String[] args) {
	String address="USA,killeen";
	if(address.endsWith("USA")) {
		if(address.contains("killeen")) {
			System.out.println("The city is correct");
		}else {
			System.out.println("The city is incorrect");
		}
	}else {
			System.out.println("The country is correct");
		}
	}
	
	}



