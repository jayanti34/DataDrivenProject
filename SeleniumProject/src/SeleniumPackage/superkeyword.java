package SeleniumPackage;
class car{
	String color="blue";
}
class van extends car{
	String color="grey";

void printcolor() {
	System.out.println(color);
	System.out.println(super.color);
}
}
public class superkeyword {

	public static void main(String[] args) {
	van v=new van();
	v.printcolor();

	}

}
