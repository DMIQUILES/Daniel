import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		char N=0;
		double N1, N2;
		
		while (N != 'h'){
			
		System.out.println(" a - Adi��o ");
		System.out.println(" b - Subtra��o ");
		System.out.println(" c - Multiplica��o ");
		System.out.println(" d - Quociente da divis�o ");
		System.out.println(" e - Resto da divis�o ");
		System.out.println(" f - Potencia��o ");
		System.out.println(" g - Adi��o ");
		System.out.println(" h - SAIR ");
		N = sc.next().charAt(0);
		 
		System.out.println(" Digite o primeiro n�mero: ");
			N1 = sc.nextDouble();
			System.out.println(" Digite o segundo n�mero: ");
			N2 = sc.nextDouble();
			
			if(N == 'a'){
				System.out.println(N1 + N2);
			}
			
			else if(N == 'b'){
				System.out.println(N1-N2);
			}
			
			else if(N == 'c'){
				System.out.println(N1*N2);
		    }
			
			else if(N == 'd'){
				System.out.println(N1/N2);
			}
			
			else if(N == 'e'){
				System.out.println(N1%N2);
			}
			
			else if(N == 'f'){
				System.out.println(Math.pow(N1, N2));
	        }
			
			else if(N == 'g'){
				System.out.println(N1+N2/2);
			}
			
			else if(N == 'h'){
				System.exit(0);
			}
			
			else{
				System.out.println(" Escolha inv�lida ");
			}
				}
			}

}
