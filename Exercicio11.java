import java.util.Scanner;

public class Exercicio11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N;
	
	System.out.println(" Digite um n�mero: ");
	N = sc.nextInt();
	while(N<1 || N>50){
		System.out.println(" N�mero invalido!! digite outro n�mero: ");
		N = sc.nextInt();
	}
	while( N <250){
		if (N*2<250){
		N = N*2;
		
		System.out.println( N );
	}
	}
}
}
