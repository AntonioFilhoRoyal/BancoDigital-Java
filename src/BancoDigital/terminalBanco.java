package BancoDigital;

import java.util.Scanner;

public class terminalBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Conta cc = new ContaCorrente(); // CONSTRUCTOR POUPANÇA
		Conta cp = new ContaPoupança(); // CONSTRUCTOR CORRENTE
		
		cc.extrato(); // CONTA 1
		cp.extrato(); // CONTA 2
		
		System.out.println("Valor depositado na Conta Poupança");
		cp.depositar(100);
		System.out.println("");
		
		cp.extrato();
		
		System.out.println("Transferencia de R$ 50,00 da Conta Poupança para Conta Corrente");
		cp.transferir(50, cc);
		System.out.println("");
		
		cc.extrato();
		cp.extrato();

	}

}