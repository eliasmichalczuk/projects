import java.util.Random;

public class Carta {
	private String Nome;
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}

	public int getAutonomia() {
		return Autonomia;
	}

	public void setAutonomia(int autonomia) {
		Autonomia = autonomia;
	}

	public int getComprimento() {
		return Comprimento;
	}

	public void setComprimento(int comprimento) {
		Comprimento = comprimento;
	}

	public int getEnvergadura() {
		return Envergadura;
	}

	public void setEnvergadura(int envergadura) {
		Envergadura = envergadura;
	}

	public int getPesoDecolagem() {
		return PesoDecolagem;
	}

	public void setPesoDecolagem(int pesoDecolagem) {
		PesoDecolagem = pesoDecolagem;
	}

	private int Velocidade;
	private int Autonomia;
	private int Comprimento;
	private int Envergadura;
	private int PesoDecolagem;
	
	public Carta(String nome, int velocidade, int autonomia, int comprimento,int envergadura, int pesoDecolagem) {
		Nome = nome;
		Velocidade = velocidade;
		Autonomia = autonomia;
		Comprimento = comprimento;
		Envergadura = envergadura;
		PesoDecolagem = pesoDecolagem;
	}
	public Carta() {
		
	}

	public static Carta getCarta() {
		Random rand = new Random();
		int randName = rand.nextInt((1500 - 500) + 1 + 500);
		return new Carta("Boeing " + randName, 
				rand.nextInt((1500 - 500) + 1 + 500),
				rand.nextInt((7000 - 3000) + 1 + 3000), 
				rand.nextInt((48 - 28) + 1 + 28), 
				rand.nextInt((35 - 26) + 1 + 26),
				rand.nextInt((65000 - 50000) + 1 + 50));
	}
	
}
