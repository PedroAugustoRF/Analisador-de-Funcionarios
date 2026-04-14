package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class AppUser {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o caminho do arquivo: ");
		File caminho = new File(sc.nextLine());
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			List<Funcionario> lista = new ArrayList<>();
			String linha = br.readLine();
			
			while (linha != null) {
				String[] campo = linha.split(",");
				lista.add(new Funcionario(campo[0], campo[1], Double.parseDouble(campo[2])));
				
				linha = br.readLine();
			}
			
			System.out.print("Digite um salário: ");
			Double salario = sc.nextDouble();
			sc.nextLine();
			
			
			List<String> funcionarios = lista.stream()
					.filter(p -> p.getSalario() > salario)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			funcionarios.forEach(System.out::println);
			
			System.out.print("Digite uma letra para somar o salário de todos funcionarios que o nome começa com essa letra: ");
			char letra = sc.next().toUpperCase().charAt(0);
			sc.nextLine();
			
			double soma = lista.stream()
					.filter(p -> p.getNome().charAt(0) == letra)
					.map(p -> p.getSalario())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.printf("Soma dos salários dos funcionários cujo nome começa com %c: %.2f", letra, soma);
			
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		sc.close();
	}
}