package BancoDigital;

public class ContaCorrente extends Conta{
	public void extrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.extrato();
		
		System.out.println("");
	}
}
