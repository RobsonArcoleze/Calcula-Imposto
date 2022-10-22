package application;

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
		
		for(int i=0; i<n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			
			sc.nextLine(); // CONSUMINDO O NEXTINT
						
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if(resp == 'i') {
				System.out.print("Health expenditures: ");
				double gastosComSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosComSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int numeroDeFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numeroDeFuncionarios));
			}
		}
		System.out.println();
		
		System.out.println("TAXES PAID: ");
		
		double sum = 0.0;
		for(Pessoa pessoa : list) {
			double imposto = pessoa.imposto();
			System.out.println(pessoa.getName() + ": $ " + String.format("%.2f", imposto));
			sum += imposto;
		}
		System.out.println();
		
		System.out.print("TOTAL TAXES: $ ");
		System.out.print(String.format("%.2f", sum));
		
		
		sc.close();
	}

}
