package assign2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			
			System.out.println("1.first name\n2.last name\n3.email \n4.password \n5.registrationAmount \n6.dob \n7.ServicePlan");
			Customer cus=new Customer(sc.next(), sc.next(),sc.next(), sc.next(), sc.nextDouble(),
					LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd-MM-yyyy")),ServicePlan.valueOf(sc.next()));
			System.out.println(cus);			
		}
	}

}
