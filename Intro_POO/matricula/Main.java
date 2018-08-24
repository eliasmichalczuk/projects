/*
1) Crie exemplos de como funcionam os metodos ja existentes na classe Estudante.
FEITO 2) Crie um metodo no estudante para contar a carga horaria atual dele. 
FEITO 3) Impeca que estudantes possam adicionar disciplinas que sejam 3 fases a frente da sua atual.
FEITO 4) Crie uma classe Fase para organizar as disciplinas.
TODO: 5) Cadastre todas as disciplinas do TADS.
FEITO 6) Faça com que um objeto do tipo Fase consiga fazer uma lista de todas as suas materias.
FEITO 7) Faça com que um objeto do tipo Fase consiga calcular a sua carga horaria total.
*/
public class Main{
  public static void main(String[] args){
    Estudante e = new Estudante("joao","carlos",2017,2,2);

    Disciplina[] disciplinas = new Disciplina[4];

    disciplinas[0] = new Disciplina();
    disciplinas[0].nome = "Algoritmos";
    disciplinas[0].cargaHoraria = 4;
    disciplinas[0].fase = 1;
    disciplinas[0].codigo = "AGT0001";

    disciplinas[1] = new Disciplina();
    disciplinas[1].nome = "Matematica Financeira";
    disciplinas[1].cargaHoraria = 3;
    disciplinas[1].fase = 2;
    disciplinas[1].codigo = "MAT0002";

    disciplinas[2] = new Disciplina();
    disciplinas[2].nome = "Estrutura de Dados";
    disciplinas[2].cargaHoraria = 4;
    disciplinas[2].fase = 3;
    disciplinas[2].codigo = "EDA0001";

    disciplinas[3] = new Disciplina();
    disciplinas[3].nome = "Banco de Dados I";
    disciplinas[3].cargaHoraria = 4;
    disciplinas[3].fase = 4;
    disciplinas[3].codigo = "BAN1001";
    
    System.out.println("Pressione S para exibir disciplinas disponiveis: ");
    Scanner scan = new Scanner();
    if(scan.nextLine === s) {
    	mostrarDisciplinas(e);
    }
    System.out.println("Saindo.");
    
  }
  mostrarDisciplinas(e)
  {
	  System.out.println("disciplinas disponíveis:");
	    for(int i =0;i<disciplinas.length;i++)
	    {
	    	if(verificarFaseAluno(e, disciplinas[i]))
	    	{
	    		String linha = (i+1)+" "+disciplinas[i].nome;
	  	      System.out.println(linha);
	    	}
	    }
  }
}
