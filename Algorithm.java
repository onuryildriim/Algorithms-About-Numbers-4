import java.util.Scanner;

public class Algorithm {
	
	int a;
	int neg = 0;
	int poz = 0;
	
	Scanner sc = new Scanner(System.in);

	public void negAndPozFind() {
		System.out.println("Enter 10 integers: ");
		for(int i = 1; i<11; i++) {
			a = sc.nextInt();
			if(a < 0) {
				neg = neg + 1;
			}
			if(a>0) {
				poz = poz + 1;
			}
		}
		System.out.println("Total negative number: " + neg + "\n" + "Total positive number: " + poz);
	}
}
