public class BalancaDeProdutos{

  public Produto maisPesado(Produto p1, Produto p2){
	  //cria um metodo publico chamado maisPesado que recebe dois parametros, produto p1 e produto p2
    if(p1.peso > p2.peso) return p1;
    //compara se p1 é meior que p2, se sim retorna p1
    else return p2;
    // se nao retorna p2

    return null;
  }
}
