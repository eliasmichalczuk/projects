public class CalculadoraComMemoria{
  int primeiroNumero;
  int segundoNumero;

  public int somar(){
    int resultado = this.primeiroNumero+this.segundoNumero;
    return resultado;
  }
  public int multiplicar(){
	    this.primeiroNumero*this.segundoNumero;
	  }
  public int subtrair(){
	  return this.primeiroNumero-this.segundoNumero;
	  }
  public int dividir(){
	  if(segundoNumero == 0)
	  {
		  return "Não é possível dividir por zero";
	  }
	  return this.primeiroNumero/this.segundoNumero;
	  }
  
}
