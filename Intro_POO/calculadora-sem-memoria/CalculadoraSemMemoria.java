
public class CalculadoraSemMemoria{

  public int subtrair(int p1, int p2){
    int resultado = p1-p2;
    return resultado;
  }
  		public int somar(int p1, int p2){
	    return p1+p2;
	  }
	  public int multiplicar(int p1, int p2){
		 return p1*p2;
	  }
	  
	  public int dividir(int p1, int p2){
		  if(p2 == 0)
		  {
			  return "N�o � poss�vel dividir por zero";
		  }
		  return p1/p2;
		  }
}
