/*
1) Crie dois objetos do tipo produto e um do tipo BalancaDeProdutos.
2) Comente o que faz cada linha do metodo maisPesado.
3) Para que serve o return null do metodo maisPesado do ponto de vista sintatico e semantico?
/// retornar null indica que não há nada a ser exibido, não há nada a retornar, aqui indicando que os dois possuem o mesmo peso
 * além de que, assim não é possível acessar as propriedades de um nulo, por nao ser um objeto, sendo mais facil de identificar bugs
4) Use o metodo maisPesado para informar qual e o mais pesado.
5) Crie um metodo que retorne um boolean e diga se dois Produtos tem o mesmo peso.
*/
public class Main{
  public static void main(String[] args){
	  Produto p1 = new Produto("P1 - pao",2.0);
	  Produto p2 = new Produto("P2 - gelatina",0.1);
	  
	  BalancaDeProdutos balanca = new BalancaDeProdutos();
	  p3 = new Produto("null",0);
	  var p2 = balanca.maisPesado(p1, p2);
	  System.out.println(p3.nome);
	  //informa qual o mais pesado pelo nome
  }
}
