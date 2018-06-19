
public class CalculoParcela {
	
	public double calculaParcela (double valor, int pgtos) 
        {
            double parcela;
                if (pgtos > 5) {
                     valor += (valor * 10/100);
                }else if (pgtos> 2) {
                            valor += (valor * 5/100);
                }
            parcela = valor/pgtos;
            return parcela;
        }
	

}
