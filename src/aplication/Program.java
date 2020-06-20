package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.printf("Tax payer #%d data:\n",i);
			System.out.print("Individual or company (i/c)? ");
			// entrada de dados de um char
			char os = sc.next().charAt(0);
			// apos entrada deve se pular uma linha
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if (os == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PessoaFisica(name, annualIncome, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new PessoaJuridica(name, annualIncome, numberEmployees));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		// for diferente
		for (Pessoa person: list) {
		System.out.println(person.toString());	
		}	
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ ");
		
		double sum = 0.0;
		for (Pessoa person: list) {
			sum += person.imposto();	
		}
		System.out.printf("%.2f",sum);
		
		
		sc.close();
		
		
	}

}
