package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.getDefault());
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Por favor, digite o numero da sua conta:");
		numero = scan.nextInt();
		System.out.println("Digite o numero da sua agencia:");
		agencia = scan.next();
		System.out.println("Digite seu nome:");
		nomeCliente = scan.next();
		System.out.println("Digite o saldo da sua conta:");
		saldo = scan.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
				", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
	
		scan.close();
	}

}
