import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;
	public class Teste extends TestCase{
	
		
		private static final double DELTA = 0.000001;
	    
	    @Test
	    public void testSomaDeveRetornar0QuandoPassamosZeroEZero() {
	        double n1 = 0;
	        double n2 = 0;
	        int x=0,y=0;
	 
	        Calculadora aut = new Calculadora();
	 
	        double valorObtido = aut.somar(x, y);
	        double valorEsperado = 0;
	 
	        assertEquals(valorEsperado, valorObtido, DELTA);
	    }
	    
	    public void testSubtracao()
	    {
	    	double n1 = 5;
	        double n2 = 3;
	        int x=5,y=3;
	        
	        Calculadora aut2 = new Calculadora(n1, n2);
	        
	        int valorObtido = aut2.subtrair(x,y);
	        double valorEsperado = 2;
	        
	        assertEquals(valorEsperado, valorObtido, 0.1);
	    }
	
	    public void testMultiplicacao()
	    {
	    	double n1 = 5;
	        double n2 = 2;
	        int x=5,y=2;
	        
	        Calculadora aut3 = new Calculadora(n1, n2);
	        
	        double valorObtido = aut3.multiplicar(x,y);
	        double valorEsperado = 10;
	        
	        assertEquals(valorEsperado, valorObtido, 0.1);
	    }
	    
	    public void testDivisao()
	    {
	    	double n1 = 8;
	        double n2 = 2;
	        int x=8,y=2;
	        
	        Calculadora aut4 = new Calculadora(n1, n2);
	        
	        double valorObtido = aut4.dividir(x,y);
	        double valorEsperado = 4;
	        
	        assertEquals(valorEsperado, valorObtido, 0.1);
	    }
}
