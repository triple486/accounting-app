
public class AccountingApp {

	public static void main(String[] args) {
		//added Value of supply, VAT, and total
		System.out.println("Value of supply : "+10000.0);
		System.out.println("VAT : "+ (10000.0*0.1) );
		System.out.println("Total : "+ (10000.0 + 10000.0*0.1) );
	}

}
