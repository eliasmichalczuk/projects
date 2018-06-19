import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;
public class ParcelaTeste extends TestCase{

	public void testParcela()
	{
		float x=500;
		int y = 6;
		
		CalculoParcela test = new CalculoParcela();
		
		double valorObtido = test.calculaParcela(x, y);
        double valorEsperado = 50;
 
        assertEquals(valorEsperado, valorObtido, 0.1);
	}
		
}
