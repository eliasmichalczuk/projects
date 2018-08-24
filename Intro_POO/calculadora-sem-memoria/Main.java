/*
1) criar um metodo para somar e usa-lo
2) criar um metodo para multiplicar e usa-lo
3) crair um método para dividir e usa-lo
4) impedir que que seja feita uma divisao por zero
*/

public class Main{
  public static void main(String[] args){
    CalculadoraSemMemoria csm = new CalculadoraSemMemoria();
    //int resultado = ccm.subtrair(50,10);
    System.out.println("somar : " + ccm.somar(50,10));
    System.out.println("multiplicar : " + ccm.multiplicar(50,10));
    System.out.println("subtrair : " + ccm.subtrair(50,10));
    System.out.println("dividir : " + ccm.dividir(50,10));
  }
}
