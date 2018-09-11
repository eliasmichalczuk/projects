import java.util.ArrayList;


public class Usuario {
	private String Nome;
	private ArrayList<Carta> Deck = new ArrayList<Carta>(); 
	public int opcaoAtual = 0;
	Carta cartaAtual = new Carta();
	
	public String getNome() {
		return Nome;
	}
	
	public boolean verifica(){
		return this.Deck.isEmpty();
	}

	public void setNome(String nome) {
		Nome = nome;
	}
/*
	public boolean Response(this Usuario user) {
		if(this.Deck.size()>0)
			return true;
		return false;
		
	}*/

	public void setDeck(ArrayList<Carta> deck) {
		Deck = deck;
	}
	public void addCartaDeck(Carta carta) {
		this.Deck.add(carta);
	}
	public Usuario(String nome){
		Nome = nome;
	}
	public Usuario(){
		
	}
	public Carta getCarta(){
		Carta atual = this.Deck.get(0);
		this.Deck.remove(0);
		return atual;
	}
	
}

