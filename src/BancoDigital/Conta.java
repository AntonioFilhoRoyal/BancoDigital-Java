package BancoDigital; // V 1.0.0 - BANCODIGITAL
	//	(1) VERSÃO OFICIAL . (0) MODIFICAÇÃO . (0) AJUSTES DE BUGS

	// CLASSE MÃE
public class Conta {
	
	// COMO O "EXTRATO" ESTA NA MESMA CLASSE QUE A "AGENCIA", ENTÃO A GEREÇÃO NÃO PRECISAR SER PUBLICA
	private int AGENCIA = 1;
	private static int CONTA = 1; // DA MESMA FORMA OCORRE NA CONTA
	
	public double saldo; // saldo da conta
	public int agencia; // agencia do cliente
	public int conta; // numero da conta do cliente
	
	// AGENCIA/CONTA
	public Conta() {
		this.agencia = AGENCIA;
		this.conta = CONTA++; // FAZENDO UM INCREMENTO PARA CADA VEZ QUE UMA CONTA FOR CRIADA
						// ELE ADICIONA MAIS 1 A CONTA.  CONTA 1... CONTA 2... CONTA 3...
	}
		
		// EM ANDAMENTO: SALDO PARA USA NO METODO DE INVESTIMENTO
	public double saldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	
	// METODO SACAR
	public void sacar(double valor) {
		
		// CONDIÇÃO DE SAQUE
		if(saldo > valor) {
			// OPERAÇÃO DE RETIRADA DO SALDO
			saldo -= valor;
			System.out.println("Saque: " + "R$ " + valor);
	
		} else {
				// CASO O VALOR DE RETIRADA SEJA MAIOR QUE O SALDO DA CONTA, ELE RETORNARA O SALDO DA CONTA
			System.out.println("Valor indisponivel: " + "R$ " + saldo);
			}
		
		
	};
	
		// METODO DEPOSITAR
	public void depositar(double valor) {
		
		// DEPOSITO NÃO PRECISA DE CONDIÇÃO, POIS VAI INCREMENTA UM VALOR
		saldo += valor;
		
			// RETORNA O VALOR DEPOSITADO
		System.out.println("Depositado: " + "R$ " + valor);
		//System.out.println("Novo Saldo: " + saldo);
		
	};
	
		// EM ANDAMENTO: METODO TRANSFERIR
	public void transferir(double valor, Conta contadestino) {
				// INDICAÇÃO DE TRANSFERENCIA
			System.out.println("=== Transferencia ===");
			
			// PEGA O VALOR DE SAQUE 
			this.sacar(valor);	// E
				// DEPOSITA NA CONTADESTINO
			contadestino.depositar(valor);
	}

	// EM ANDAMENTO: METODO EXTRATO
	public void extrato() {
		
		// ...
		
		System.out.println(String.format("Agencia: " + "%d", agencia));
		System.out.println(String.format("Conta: " + "%d", conta));
		System.out.println(String.format("Saldo: " + "R$ %.2f", saldo));
		
		// ...
		
	}
	
	// EM ANDAMENTO: METODO INVESTIMENTO
	public void investimento(int valor) {
		
		// ...
	};
	
}
