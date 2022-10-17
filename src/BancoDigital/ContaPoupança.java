package BancoDigital;

public class ContaPoupança extends  Conta{
	
		// IMPRESSÃO DO EXTRATO DA CONTA
	public void extrato() {
		
		System.out.println("=== Extrato Conta Poupança ===");
		super.extrato(); // METODO DA CLASSE MÃE
		
		System.out.println("");
	}
	
		// EM DESENVOLVIMENTO: METODO PARA INVESTIMENTO ( CALCULO DE INVESTIMENTO SIMBOLICO )
	public void investimento(int valor) {
		super.investimento(valor); // METODO DA CLASSE MÃE
		
				// O valor na conta precisa ser maior doque o valor investido
		if( super.saldo() > valor) {
				// CASO DE CONDIÇÃO
			System.out.println(String.format("Valor investido: " + "R$ %d", valor));
			valor = valor * (valor / 90);
		} else {
				// CASO DE CONDIÇÃO
			System.out.println("VALOR DO INVESTIMENTO INDISPONIVEL");
		}
			
			// RETORNO
		System.out.println(String.format("Retorno do investimento: " + "R$ %d", valor));
		System.out.println(""); // ESPAÇAMENTO PARA A IMPRESSÃO DO EXTRATO
		
		extrato();
	}
	
}
