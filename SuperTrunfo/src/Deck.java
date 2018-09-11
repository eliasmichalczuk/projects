import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;



public class Deck {
	private ArrayList<Carta> Deck = new ArrayList<Carta>(); 
	
	public Deck(ArrayList<Carta> deck) {
		Deck = deck;
	}
	public Deck() {
		
	}
	public void setDeck(ArrayList<Carta> deck){
		Deck = deck;
	}
	public ArrayList<Carta> getDeck(){
		return this.Deck;
	}
	public void geraCartasAoDeck(){
		for(int i = 0; i < 30; i++) {
			this.Deck.add(Carta.getCarta());
		}
	}
	public void printCartas(ArrayList<Carta> deck){
		for(Carta carta : deck) {
			System.out.println(carta.getNome());
			System.out.println("Velocidade: " + carta.getVelocidade());
			System.out.println("Autonomia: " + carta.getAutonomia());
			System.out.println("Envergadura: " + carta.getEnvergadura());
			System.out.println("Comprimento: " + carta.getComprimento());
			System.out.println("Peso na decolagem: " + carta.getPesoDecolagem());
		}
	}
	public void printCarta(Carta carta){
			System.out.println(carta.getNome());
			System.out.println("Velocidade: " + carta.getVelocidade());
			System.out.println("Autonomia: " + carta.getAutonomia());
			System.out.println("Envergadura: " + carta.getEnvergadura());
			System.out.println("Comprimento: " + carta.getComprimento());
			System.out.println("Peso na decolagem: " + carta.getPesoDecolagem());
		
	}
	public void addCartaDeck(Carta carta) {
		this.Deck.add(carta);
	}
	/*public Carta getCarta(Usuario user){
		Carta atual = user.getDeck().get(0);
		user.getDeck().remove(0);
		return atual;
		
	}*/
	public int getRoundResult(Usuario jogador, Usuario comp) {
		//TODO: pegar atributo com corresponde a opcao + 1
		if(jogador.opcaoAtual != 0) {
			switch(jogador.opcaoAtual){
			case 1: if(comp.cartaAtual.getVelocidade() > jogador.cartaAtual.getVelocidade()) {
				return 1;
			}
				return 2;
			case 2: if(comp.cartaAtual.getAutonomia() > jogador.cartaAtual.getAutonomia()){
				return 1;
			}
				return 2;
			case 3: if(comp.cartaAtual.getComprimento() > jogador.cartaAtual.getComprimento()){
				return 1;
			}
				return 2;
			case 4: if(comp.cartaAtual.getEnvergadura() > jogador.cartaAtual.getEnvergadura()){
				return 1;
			}
				return 2;
			case 5: if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem()){
				return 1;
			}
				return 2;
			default: if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem()){
				return 1;
			}
				return 2;
			}
		}
		else {
			switch(comp.opcaoAtual){
			case 1: if(comp.cartaAtual.getVelocidade() > jogador.cartaAtual.getVelocidade())
				return 1;
				return 2;
			case 2: if(comp.cartaAtual.getAutonomia() > jogador.cartaAtual.getAutonomia())
				return 1;
				return 2;
			case 3: if(comp.cartaAtual.getComprimento() > jogador.cartaAtual.getComprimento())
				return 1;
				return 2;
			case 4: if(comp.cartaAtual.getEnvergadura() > jogador.cartaAtual.getEnvergadura())
				return 1;
				return 2;
			case 5: if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem())
				return 1;
				return 2;
			default: if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem())
				return 1;
				return 2;
			}
		}
	}
	
	/*private void Sort(ArrayList<Carta> deck){
		//return Collections.shuffle(deck.deck);
		Random rnd = ThreadLocalRandom.current();
		for (int i = deck.size() - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      Carta a = deck.get(index);
	      deck.set(index, deck.get(i));
	      deck.set(i, deck.(a)); 
	    }
	}*/
	
	
	
}
	