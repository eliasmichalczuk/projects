/*
1) criar um metodo para diminuir e usa-lo
2) criar um metodo para multiplicar e usa-lo
3) crair um método para dividir e usa-lo
4) impedir que que seja feita uma divisao por zero
*/

public class Main{
  public static void main(String[] args){
    CalculadoraComMemoria ccm = new CalculadoraComMemoria();
    ccm.primeiroNumero = 10;
    ccm.segundoNumero = 1;
    System.out.println("somar : " + ccm.somar());
    System.out.println("multiplicar : " + ccm.multiplicar());
    System.out.println("subtrair : " + ccm.subtrair());
    System.out.println("dividir : " + ccm.dividir());
  }
}
