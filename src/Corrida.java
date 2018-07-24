import java.util.Random;
import java.util.Scanner;

public class Corrida {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		Coelho coelho = new Coelho("Coelho", 1);
		Tartaruga tartaruga = new Tartaruga("Tartaruga", 2);
		
		int[] pista = new int[70];
		int segundos = 0, pistaCoelho = 0, pistaTartaruga = 0, movimentoCoelho, movimentoTartaruga;
		
		System.out.println("A corrida da Tartaruga e a Lebre.\n"
				+ "Esse programa simula a corrida da história da Tartaruga e a Lebre.\n"
				+ "A cada volta do laço de repetição um movimento aleatório é escolhido para a Tartaruga e a Lebre.\n"
				+ "Os movimentos da Tartaruga são:\n"
				+ "	- Caminhada rápida: avança 3 casas - 50% de chances de acontecer.\n"
				+ "	- Escorregão: volta 6 casas - 20% de chances de acontecer.\n"
				+ "	- Caminha lenta: avança 1 casa - 30% de chances de acontecer.\n"
				+ "Os movimentos da Lebre são:\n"
				+ "	- Dormir: Fica na mesma casa - 20% de chances de acontecer.\n"
				+ "	- Salto grande: avança 9 casas - 20% de chances de acontecer.\n"
				+ "	- Escorregão grande: volta 12 casas - 10% de chances de acontecer.\n"
				+ " - Salto pequeno: avança 1 casa - 30% de chances de acontecer.\n"
				+ " - Escorregão pequeno: volta 2 casas - 20% de chances de acontecer.\n"
				+ "T - Tartaruga, L - Lebre, AI! - Tartaruga e Lebre na mesma casa.\n"
				+ "Pressione Enter para iniciar a corrida...");
		input.nextLine();
		
		System.out.println("E LÁ VÃO ELES!!!!");
		
		do{
			
			if(segundos == 0){
				pista[pistaCoelho] += coelho.getNumero();
				pista[pistaTartaruga] += tartaruga.getNumero();
			}else{
				
				movimentoCoelho = coelho.movimentaCoelho(random.nextInt(10) + 1);
				movimentoTartaruga = tartaruga.movimentaTartaruga(random.nextInt(10) + 1);
				
				if(pistaCoelho + movimentoCoelho < 0){
					pista[pistaCoelho] -= coelho.getNumero();
					pistaCoelho = 0;
					pista[pistaCoelho] += coelho.getNumero();
				}else if(pistaCoelho + movimentoCoelho >= 70){
					pista[pistaCoelho] -= coelho.getNumero();
					pistaCoelho = 69;
					pista[pistaCoelho] += coelho.getNumero();
				}else{
					pista[pistaCoelho] -= coelho.getNumero();
					pistaCoelho+= movimentoCoelho;
					pista[pistaCoelho] += coelho.getNumero();
				}
				
				if(pistaTartaruga + movimentoTartaruga < 0){
					pista[pistaTartaruga] -= tartaruga.getNumero();
					pistaTartaruga = 0;
					pista[pistaTartaruga]+= tartaruga.getNumero();
				}else if(pistaTartaruga + movimentoTartaruga >= 70){
					pista[pistaTartaruga] -= tartaruga.getNumero();
					pistaTartaruga = 69;
					pista[pistaTartaruga] += tartaruga.getNumero();
				}else{
					pista[pistaTartaruga] -= tartaruga.getNumero();
					pistaTartaruga+= movimentoTartaruga;
					pista[pistaTartaruga] += tartaruga.getNumero();
				}
				
			}
			
			exibePista(pista);
			segundos++;
			
			//input.nextLine();
			
		}while(pista[69] == 0);
		
		if(pista[69] == coelho.getNumero()){
			System.out.println("A LEBRE GANHOU. OH.");
		}else if(pista[69] == tartaruga.getNumero()){
			System.out.println("A TARTARUGA GANHOU. EH.");
		}else if(pista[69] == coelho.getNumero() + tartaruga.getNumero()){
			System.out.println("OCORREU UM EMPATE.");
		}
		
	}
	
	public final static void exibePista(int[] pista){
		for (int i = 0; i < pista.length; i++){
			if(pista[i] == 3){
				System.out.printf("AI!");
			}else if(pista[i] == 2){
				System.out.printf("T  ");
			}else if(pista[i] == 1){
				System.out.printf("L  ");
			}else{
				System.out.printf("   ");
			}
		}
		System.out.println("chegada");
	}

}
