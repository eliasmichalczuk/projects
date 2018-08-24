
public class Fase {
	public int fase;
	Disciplina[] disciplinas;
			
			public int contarCargaHoraria(){
				  int cargaHoraria = 0;
				  for(int i =0;i<this.disciplinas.length;i++){
					  cargaHoraria += disciplinas[i].cargaHoraria;
				    }
				  return cargaHoraria;
			  }
	
			public int listarDisciplinas(){
				System.out.println("NOME   CODIGO   FASE   CARGA HORARIA");
			    for(int i =0;i<this.disciplinas.length;i++){
			    	System.out.println(disciplinas[i].nome + " " + disciplinas[i].codigo + " " + disciplinas[i].fase 
			    			+ " " + disciplinas[i].cargaHoraria);
			    }
			  }
			
	verificarFaseAluno(Disciplina disciplina, Estudante aluno){
		if(disciplina.fase >= aluno.fase+3) {
			return false;
		}
		return true;
	}
}
