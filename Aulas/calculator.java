package Aulas;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a, b;
		
		int c;
		do {
			System.out.println("---- Escolha a opera��o que deseja realizar -----");
			System.out.println(" 1 -- Adi��o");
			System.out.println(" 2 -- Subtra��o");
			System.out.println(" 3 -- Divis�o");
			System.out.println(" 4 -- Multiplica��o");
			System.out.println(" 5 -- SAIR");
			c=sc.nextInt();
			System.out.println();
			
			
	
		if(c==1){
			System.out.println("Digite um n�mero");
			a = sc.nextDouble();
			System.out.println("Digite outro n�mero");
			b=sc.nextDouble();
			System.out.println(somanumeroseretornarvalor(a,b));
			System.out.println();
			
			
		}
		else if(c==2){	
			System.out.println("Digite um n�mero");
					a = sc.nextDouble();
		System.out.println("Digite outro n�mero");
		b=sc.nextDouble();
		System.out.println(subnumeroseretornarvalor(a,b));
		System.out.println();
		}
		else if(c==3){
			System.out.println("Digite um n�mero");
			a = sc.nextDouble();
			System.out.println("Digite outro n�mero");
			b=sc.nextDouble();
		System.out.println(divnumeroseretornarvalor(a,b));
		System.out.println();
		}
		else if(c==4){
			System.out.println("Digite um n�mero");
			a = sc.nextDouble();
			System.out.println("Digite outro n�mero");
			b=sc.nextDouble();
			System.out.println( multnumeroseretornarvalor(a,b));
			System.out.println();
		}
		} while (c!=5);
		
		
		


				
			}
	public static double divnumeroseretornarvalor(double a, double b ){
		System.out.println("chamando uma fun��o");
		System.out.println("O valor de a "+a);
		System.out.println("O valor de b " +b);
		System.out.println();
		System.out.println("Divis�o dos valores "+(a/b));
		System.out.println();
		return a/b;
	}
	public static double somanumeroseretornarvalor(double a, double b ){
		System.out.println("chamando uma fun��o");
		System.out.println("O valor de a "+a);
		System.out.println("O valor de b " +b);
		System.out.println();
		System.out.println("Soma dos valores"+(a+b));
		System.out.println();
		return a+b;
	}
	public static double subnumeroseretornarvalor(double a, double b ){
		System.out.println("chamando uma fun��o");
		System.out.println("O valor de a "+a);
		System.out.println("O valor de b " +b);
		System.out.println();
		System.out.println("Subtra��o dos valores"+(a-b));
		System.out.println();
		return a-b;
	}
	public static double multnumeroseretornarvalor(double a, double b ){
		System.out.println("chamando uma fun��o");
		System.out.println("O valor de a "+a);
		System.out.println("O valor de b " +b);
		System.out.println();
		System.out.println("Multiplica��o dos valores"+(a*b));
		System.out.println();
		return a*b;
	}
			
					
		}
