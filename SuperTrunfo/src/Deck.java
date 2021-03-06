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
			System.out.println("------" + carta.getNome() + "------");
			System.out.println("1 Velocidade: " + carta.getVelocidade());
			System.out.println("2 Autonomia: " + carta.getAutonomia());
			System.out.println("3 Comprimento: " + carta.getComprimento());
			System.out.println("4 Envergadura: " + carta.getEnvergadura());
			System.out.println("5 Peso na decolagem: " + carta.getPesoDecolagem());
		}
	}
	public void printCarta(Carta carta){
			System.out.println("------" + carta.getNome() + "------");
			System.out.println("1 Velocidade: " + carta.getVelocidade());
			System.out.println("2 Autonomia: " + carta.getAutonomia());
			System.out.println("3 Comprimento: " + carta.getComprimento());
			System.out.println("4 Envergadura: " + carta.getEnvergadura());
			System.out.println("5 Peso na decolagem: " + carta.getPesoDecolagem());
		
	}
	public void addCartaDeck(Carta carta) {
		this.Deck.add(carta);
	}
	/*public Carta getCarta(Usuario user){
		Carta atual = user.getDeck().get(0);
		user.getDeck().remove(0);
		return atual;
		
	}*/
	public static int getRoundResult(Usuario jogador, Usuario comp) {
		//TODO: pegar atributo com corresponde a opcao + 1
		/*if(jogador.opcaoAtual != 0)*/
		int temp = 0;
		if(jogador.opcaoAtual != 0) temp = jogador.opcaoAtual;
		else temp = comp.opcaoAtual;
		
		if(temp == 1) {
			if(comp.cartaAtual.getVelocidade() > jogador.cartaAtual.getVelocidade())
				return 2;
				if(comp.cartaAtual.getVelocidade() == jogador.cartaAtual.getVelocidade())
					return 0;
				
				System.out.println(comp.cartaAtual.getVelocidade());
				return 1;
				
		}
		if(temp == 2) {
			if(comp.cartaAtual.getAutonomia() > jogador.cartaAtual.getAutonomia())
				return 1;
			if(comp.cartaAtual.getAutonomia() == jogador.cartaAtual.getAutonomia())
				return 0;
			System.out.println(comp.cartaAtual.getAutonomia());
			return 2;
		}
		
		if(temp == 3) {
			if(comp.cartaAtual.getComprimento() > jogador.cartaAtual.getComprimento())
				return 1;
				if(comp.cartaAtual.getComprimento() == jogador.cartaAtual.getComprimento())
					return 0;
				System.out.println(comp.cartaAtual.getComprimento());
				return 2;
		}
		
		if(temp == 4) {
			if(comp.cartaAtual.getEnvergadura() > jogador.cartaAtual.getEnvergadura())
				return 1;
				if(comp.cartaAtual.getEnvergadura() == jogador.cartaAtual.getEnvergadura())
					return 0;
				System.out.println(comp.cartaAtual.getEnvergadura());
				return 2;
		}
		
		if(temp == 5) {
			if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem())
				return 1;
				if(comp.cartaAtual.getPesoDecolagem() == jogador.cartaAtual.getPesoDecolagem())
					return 0;
				System.out.println(comp.cartaAtual.getPesoDecolagem());
				return 2;
		}
		else {
			if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem())
				return 1;
				if(comp.cartaAtual.getPesoDecolagem() == jogador.cartaAtual.getPesoDecolagem())
					return 0;
				System.out.println(comp.cartaAtual.getPesoDecolagem());
				return 2;
		}
		
		
			/*switch(temp){
			case 1: 
				if(comp.cartaAtual.getVelocidade() > jogador.cartaAtual.getVelocidade())
				return 1;
				if(comp.cartaAtual.getVelocidade() == jogador.cartaAtual.getVelocidade())
					return 0;
				
				System.out.println(comp.cartaAtual.getVelocidade());
				return 2;
			case 2: 
				if(comp.cartaAtual.getAutonomia() > jogador.cartaAtual.getAutonomia())
				return 1;
				if(comp.cartaAtual.getAutonomia() == jogador.cartaAtual.getAutonomia())
					return 0;
				System.out.println(comp.cartaAtual.getAutonomia());
				return 2;
			case 3: 
				if(comp.cartaAtual.getComprimento() > jogador.cartaAtual.getComprimento())
				return 1;
				if(comp.cartaAtual.getComprimento() == jogador.cartaAtual.getComprimento())
					return 0;
				System.out.println(comp.cartaAtual.getComprimento());
				return 2;
			case 4: 
				if(comp.cartaAtual.getEnvergadura() > jogador.cartaAtual.getEnvergadura())
				return 1;
				if(comp.cartaAtual.getEnvergadura() == jogador.cartaAtual.getEnvergadura())
					return 0;
				System.out.println(comp.cartaAtual.getEnvergadura());
				return 2;
			case 5: 
				if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem())
				return 1;
				if(comp.cartaAtual.getPesoDecolagem() == jogador.cartaAtual.getPesoDecolagem())
					return 0;
				System.out.println(comp.cartaAtual.getPesoDecolagem());
				return 2;
			default: 
				if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem())
				return 1;
				return 2;
			}*/
		
		/*else {
			switch(comp.opcaoAtual){
			case 1: 
				if(comp.cartaAtual.getVelocidade() > jogador.cartaAtual.getVelocidade())
				return 1;
				if(comp.cartaAtual.getVelocidade() == jogador.cartaAtual.getVelocidade())
					return 0;
				return 2;
			case 2: 
				if(comp.cartaAtual.getAutonomia() > jogador.cartaAtual.getAutonomia())
				return 1;
				if(comp.cartaAtual.getAutonomia() == jogador.cartaAtual.getAutonomia())
					return 0;
				return 2;
			case 3: 
				if(comp.cartaAtual.getComprimento() > jogador.cartaAtual.getComprimento())
				return 1;
				if(comp.cartaAtual.getComprimento() == jogador.cartaAtual.getComprimento())
					return 0;
				return 2;
			case 4: 
				if(comp.cartaAtual.getEnvergadura() > jogador.cartaAtual.getEnvergadura())
				return 1;
				if(comp.cartaAtual.getEnvergadura() == jogador.cartaAtual.getEnvergadura())
					return 0;
				return 2;
			case 5: 
				if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem())
				return 1;
				if(comp.cartaAtual.getPesoDecolagem() == jogador.cartaAtual.getPesoDecolagem())
					return 0;
				return 2;
			default: 
				if(comp.cartaAtual.getPesoDecolagem() > jogador.cartaAtual.getPesoDecolagem())
				return 1;
				return 2;
			}
		}*/
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
	