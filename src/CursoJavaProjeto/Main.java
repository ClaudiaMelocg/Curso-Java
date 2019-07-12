package CursoJavaProjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		
		

		System.out.print("Vai registrar quantos empregados?  ");
		
		int numeroEmpregado = teclado.nextInt();

		
		for (int i=1; i<=numeroEmpregado; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			System.out.print("Id: ");
			int id = teclado.nextInt();
			System.out.print("Nome: ");
			teclado.nextLine();
			String name = teclado.nextLine();
			System.out.print("Salario: ");
			double salary = teclado.nextDouble();
			list.add(new Empregado(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Entrar com empregado que terá seu salario incrementado: ");
		int id = teclado.nextInt();
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este Id não existe!");
		}
		else {
			System.out.print("Entrar com porcentagem: ");
			double percentage = teclado.nextDouble();
			emp.incrementoSalario(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("Lista dos empregados: ");
		for (Empregado obj : list) {
			System.out.println(obj);
		}
				
		teclado.close(); 
	}
		
		

}


