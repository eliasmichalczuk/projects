public class Estudante{
	private String nome;
  private String sobrenome;
  private int anoDeIngresso;
  private int semestreDeIngresso;
  private int fase;
  private Disciplina[] disciplinasAtuais;

  
  
  public Estudante(String nome, String sobrenome, int anoDeIngresso, int semestreDeIngresso, int fase){
    //this.disciplinasAtuais = new Disciplina[4];
	  this.nome = nome;
	  this.sobrenome = sobrenome;
	  this.anoDeIngresso = anoDeIngresso;
	  this.semestreDeIngresso = semestreDeIngresso;
	  this.fase = fase;
  }

  public int contarDisciplinas(){
    int quantidade = 0;
    for(int i =0;i<this.disciplinasAtuais.length;i++){
      if(disciplinasAtuais != null){
        quantidade++;
      }
    }
    return quantidade;
  }

  public boolean addDisciplina(Disciplina d){
    for(int i =0;i<this.disciplinasAtuais.length;i++){
      if(disciplinasAtuais != null){
        this.disciplinasAtuais[i] = d;
        return true;
      }
    }

    return false;
  }
  
  public incFase() {
	  this.fase++;
  }
  
  // DONE:CONTAR CARGA HORARIO ATUAL ESTUDANDE
  public int contarCargaHoraria(){
	  int cargaHoraria = 0;
	  for(int i =0;i<this.disciplinasAtuais.length;i++){
		  cargaHoraria += disciplinasAtuais[i].cargaHoraria;
	    }
	  return cargaHoraria;
  }


}
