/*
FEITO 1) Descreva o que faz cada linha do metodo main da classe Main (olhe o que faz cada metodo do moedeiro na classe Moedeiro).
FEITO 2) Faca com que o moedeiro tenho 20 moedas de um centavo.
3) Crie e use os metodos no moedeiro que sirvam para adcionar, remover, contar e calcular valor para moedas de 10 centavos.
4) Crie e use os metodos no moedeiro que sirvam para adcionar, remover, contar e calcular valor para moedas de 25 centavos.
5) Crie e use os metodos no moedeiro que sirvam para adcionar, remover, contar e calcular valor para moedas de 50 centavos.
6) Crie e use os metodos no moedeiro que sirvam para adcionar, remover, contar e calcular valor para moedas de 1 real.
7) Crie e use os metodo para contar e calcular valor de TODAS as moedas no moedeiro.
*/

public class Main{
  public static void main(String[] args){
    MoedeiroSimples moedeiroSimples = new MoedeiroSimples();
    for(int i =0;i<10;i++){
      moedeiroSimples.adicionarUmCentavo();
      //adiciona um centavo a variavel dentro do moedeiro
    }
    //faz a acao de cima 10 vezes

    moedeiroSimples.adicionarCincoCentavos();
  //adiciona +1 a variavel cinco centavos no moedeiro
    moedeiroSimples.adicionarCincoCentavos();
  //adiciona +1 a variavel cinco centavos no moedeiro
    moedeiroSimples.adicionarCincoCentavos();
  //adiciona +1 a variavel cinco centavos no moedeiro
    moedeiroSimples.adicionarCincoCentavos();
  //adiciona +1 a variavel cinco centavos no moedeiro
    moedeiroSimples.adicionarCincoCentavos();
  //adiciona +1 a variavel cinco centavos no moedeiro

    int quantidadeDeMoedasDeUmCentavo = moedeiroSimples.contarUmCentavo();
    //pega o retorno de moedas de um centavo no moedeiro
    float valorDasMoedasDeUmCentavo = moedeiroSimples.calcularValorUmCentavo();
  //pega a soma das moedas de 1 cent
    
    int quantidadeDeMoedasDeCincoCentavos = moedeiroSimples.contarCincoCentavos();
    //recebe quantodade de moedas de cinco centavos
    int valorDasMoedasDeCincoCentavos = moedeiroSimples.calcularValorCincoCentavos();
  //pega a soma das moedas de 5 cents
    
    System.out.println("qtde de moedas de 0.01:"+quantidadeDeMoedasDeUmCentavo);//quantidade
    System.out.println("valor em moedas de 0.01:"+valorDasMoedasDeUmCentavo);//valor

    System.out.println("qtde de moedas de 0.05:"+quantidadeDeMoedasDeCincoCentavos);//imprime quantidade
    System.out.println("valor em moedas de 0.05:"+valorDasMoedasDeCincoCentavos);//imprime valor
    
    for(int i =0; i<quantidadeDeMoedasDeUmCentavo;i++)
    {
    	moedeiroSimples.removerUmCentavo();
    }
    for(int i =0;i<20;i++)
    {
    	moedeiroSimples.adicionarUmCentavo();
    }//adiciona 20 moedas de um centavo
  }
}
