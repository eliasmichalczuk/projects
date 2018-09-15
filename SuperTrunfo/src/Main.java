import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(); 
		//ArrayList<Carta> array = new ArrayList<Carta>();
		Deck deck = new Deck();
		deck.geraCartasAoDeck();
		
		Deck cartasEmpate = new Deck();
		
		Deck algoMediaGeral = new Deck();
		
		/*for(int i = 0; i < 30; i++) {
			array.add(Carta.getCarta());
		}*/
		Usuario jogador = new Usuario();
		Usuario comp = new Usuario();
		
		deck.printCartas(deck.getDeck());
		
		ArrayList<Carta> total = deck.getDeck();
		System.out.println("Gerado o deck");
		
		/*int chunkSize = total.size() % 2 == 0 ? total.size() / 2 : (total.size() / 2) + 1;*/
		//TODO: converter list pra arraylist e dar o resultado para o deck do computador
		ArrayList temp = new ArrayList<Carta>(deck.getDeck().subList(0, 16));
		jogador.setDeck(temp);
		temp = new ArrayList<Carta>(deck.getDeck().subList(14, 30));
		//comp.setDeck((ArrayList)deck.getDeck().subList(15, 29));
		comp.setDeck(temp);
		System.out.println("Atribuiu as cartas");
		int _vencedor = 0;
		
		
		do{
			jogador.cartaAtual = jogador.getCarta();
			comp.cartaAtual = comp.getCarta();
			System.out.println("\nSua carta:");
			deck.printCarta(jogador.cartaAtual);
			
			if(_vencedor == 2 || _vencedor == 0){
				System.out.println("\nEscolha um atributo");
				
				jogador.opcaoAtual = scan.nextInt();
				while(jogador.opcaoAtual < 1 && jogador.opcaoAtual > 4) {
					jogador.opcaoAtual = scan.nextInt();
				}
				
			}
			else if(_vencedor == 1){
				if(!algoMediaGeral.getDeck().isEmpty()) {
					comp.opcaoAtual = algoritmo(algoMediaGeral.getDeck());
				}
				else {
					comp.opcaoAtual = rand.nextInt((5 - 1) + 1 + 1);
				}
				
				System.out.println("\nComputador escolheu " + comp.opcaoAtual + "!");
			}
			System.out.println("\nCarta do computador: ");
			deck.printCarta(comp.cartaAtual);
			System.out.println("\n");
			//TODO: criar random apropriado para computador DONE
			
			
			_vencedor = deck.getRoundResult(jogador, comp);
			//TODO: comparar vencedor com usuario jogador DONE
			if(_vencedor == 1){
				if(!cartasEmpate.getDeck().isEmpty()) {
					for(Carta carta : cartasEmpate.getDeck()) {
						comp.addCartaDeck(carta);
					}
				}
				comp.addCartaDeck(comp.cartaAtual);
				comp.addCartaDeck(jogador.cartaAtual);
				System.out.println("\nVocê perdeu o round");
			}
			if(_vencedor == 2){
				if(!cartasEmpate.getDeck().isEmpty()) {
					for(Carta carta : cartasEmpate.getDeck()) {
						jogador.addCartaDeck(carta);
					}
				}
				jogador.addCartaDeck(comp.cartaAtual);
				jogador.addCartaDeck(jogador.cartaAtual);
				System.out.println("\nVocê ganhou o round");
				
			}
			if(_vencedor == 0){
				cartasEmpate.addCartaDeck(comp.cartaAtual);
				cartasEmpate.addCartaDeck(jogador.cartaAtual);
				System.out.println("\nEmpatou!");
			}
			
			algoMediaGeral.addCartaDeck(comp.cartaAtual);
			algoMediaGeral.addCartaDeck(jogador.cartaAtual);
			
			comp.opcaoAtual = 0;
			jogador.opcaoAtual = 0;
			
		}while(!Compara(comp, jogador));
		
		if(jogador.verifica()){
			System.out.println("\nVocê perdeu o jogo.");
		}
		else{
			System.out.println("\nVocê ganhou o jogo.");
		}	
		
		/*TODO: criar rounds de jogadas, exibindo a primeira carta do deck do jogardor
		perguntar qual proprieade da carta ele escolher, comparar com a carta do computador
		e refazer ate um dos decks acabar*/
		
		//deck.setComputerDeck(deck.getDeck().);
		
		
		System.out.println("Acabou o super trunfo de avioes");
	}
	
	public static int algoritmo(ArrayList<Carta> cartas) {
		int velocidade = 0;
		int autonomia = 0;
		int comprimento = 0;
		int envergadura = 0;
		int pesoDecolagem = 0;
		int count = 0;
		
		for(Carta carta : cartas) {
			velocidade += carta.getVelocidade(); 
			autonomia += carta.getAutonomia();
			comprimento += carta.getComprimento();
			envergadura += carta.getEnvergadura();
			pesoDecolagem += carta.getPesoDecolagem();
			count++;
		}
		int[] valores = new int[5];
		valores[0] = velocidade;
		valores[1] = autonomia;
		valores[2] = comprimento;
		valores[3] = envergadura;
		valores[4] = pesoDecolagem;
		
		int indexOfMax = 0;
		System.out.println("\nPRINT LENGTH");
		System.out.println(valores.length);
		for (int i=0; i < valores.length; i++) {
	       valores[i] /= count;
	    }
	    for (int i=0; i < valores.length; i++) {
	        if (valores[i] > valores[indexOfMax]) {
	        	System.out.println("\nPRINT VALOR DO INDEX " + valores[indexOfMax]);
	            indexOfMax = i;
	        }
	        	
	    }
	    return indexOfMax+1;
	}

	public static boolean Compara(Usuario comp, Usuario jog)
	{
		return comp.verifica() && jog.verifica();
	}
}
