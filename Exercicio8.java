import java.util.Scanner;// Scanner
public class Exercicio8 { // Classe
public static void main(String[] args) { // M�todo Principal
	
	Scanner sc = new Scanner(System.in);
		double investimento, rentabilidade; // variaves
	
	System.out.println("O Valor Minimo de Investimento � R$100. Quanto deseja investir?: ");
	investimento = sc.nextDouble();
				
	if(investimento >= 100 && investimento < 1000){ // Calculo da poupan�a
		
		rentabilidade = (investimento * 0.005);
		System.out.println(investimento + " - Poupan�a - Rentabilidade Mensal = " + rentabilidade  );
			
	}else if(investimento>=1000 && investimento<2500){ // Calculo do fundo de renda fixa

		rentabilidade = (investimento * 0.005);
		System.out.println(investimento + " - Poupan�a - Rentabilidade Mensal = " + rentabilidade  );
		

		rentabilidade = (investimento * 0.01);
		System.out.println(investimento + " - Fundos de Renda Fixa - Rentabilidade Mensal = " + rentabilidade  );
		
	}else if(investimento >= 2500){ // Calculo dos CDBs

		rentabilidade = (investimento * 0.005);
		System.out.println(investimento + " - Poupan�a - Rentabilidade Mensal = " + rentabilidade  );
		

		rentabilidade = (investimento * 0.01);
		System.out.println(investimento + " - Fundos de Renda Fixa - Rentabilidade Mensal = " + rentabilidade  );
		

		rentabilidade = (investimento * 0.015);
		System.out.println(investimento + " - CDBs - Rentabilidade Mensal = " + rentabilidade  );
		
	}else if (investimento <= 0){
		System.out.println(" Fim da Aplica��o");
	}
		
		
	}
}

