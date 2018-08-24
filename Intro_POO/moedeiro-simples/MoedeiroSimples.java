public class MoedeiroSimples{
  int umCentavo;
  int VinteECinco;
  int cincoCentavos;
  int DezCentavos;
  int CinquentaCentavos;
  int UmReal;

  public void adicionarUmCentavo(){
    this.umCentavo++;
  }
  public void removerUmCentavo(){
    if(this.umCentavo > 0) this.umCentavo--;
  }
  public int contarUmCentavo(){
    return this.umCentavo;
  }
  public float calcularValorUmCentavo(){
    return this.umCentavo*0.01;
  }

  public void adicionarCincoCentavos(){
    this.cincoCentavos++;
  }
  public void removerCincoCentavos(){
    if(this.cincoCentavos > 0) this.cincoCentavos--;
  }
  public int contarCincoCentavos(){
    return this.cincoCentavos;
  }
  public float calcularValorCincoCentavos(){
    return this.cincoCentavos*0.05;
  }

  public float calcularValorVinteECinco(){
    return this.VinteECinco*0.25;
  }
   public void adicionarVinteECinco(){
    this.VinteECinco++;
  }
  public void removerVinteECinco(){
    if(this.VinteECinco > 0) this.VinteECinco--;
  }
  public int contarVinteECinco(){
    return this.VinteECinco;
  }
  
    public float calcularValorDezCentavos(){
    return this.VinteECinco*0.10;
  }
   public void adicionarDezCentavos(){
    this.DezCentavos++;
  }
  public void removerDezCentavos(){
    if(this.DezCentavos > 0) this.DezCentavos--;
  }
  public int contarDezCentavoso(){
    return this.DezCentavos;
  }


  public float calcularValorCinquentaCentavos(){
    return this.CinquentaCentavos*0.50;
  }
   public void adicionarCinquentaCentavos(){
    this.CinquentaCentavos++;
  }
  public void removerCinquentaCentavos(){
    if(this.CinquentaCentavos > 0) this.CinquentaCentavos--;
  }
  public int contarCinquentaCentavos(){
    return this.CinquentaCentavos;
  }

  public float calcularValorUmReal(){
    return this.UmReal*1.0;
  }
   public void adicionarUmReal(){
    this.UmReal++;
  }
  public void removerUmReal(){
    if(this.UmReal > 0) this.UmReal--;
  }
  public int contarUmReal(){
    return this.UmReal;
  }

  contarSoma(){
	  return umCentavo + cincoCentavos + dezCentavos + VinteECinco + cinquentaCentavos + umReal;
  }
  calcularValorTodas(){
	  return umCentavo*0.01 + (cincoCentavos*0.05) + (DezCentavos*0.10) + VinteECinco*0.25 + CinquentaCentavos*0.50 + UmReal;
  }
}

enum moedas{
	UM(umCentavo), CINCO, DEZ, VINTE_E_CINCO, CINQUENTA, UM_REAL
}
