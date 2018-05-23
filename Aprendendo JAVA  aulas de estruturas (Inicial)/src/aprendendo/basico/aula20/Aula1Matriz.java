package aprendendo.basico.aula20;

public class Aula1Matriz {

	public static void main(String[] args) {

		//matrizes multidimencionais
		
		double[][] notasAlunos = new double[3][4];
		
	notasAlunos[0][0]=10;	
	notasAlunos[0][1]=7;		
	notasAlunos[0][2]=8;	
	notasAlunos[0][3]=9.5;	
	
	notasAlunos[1][0]=10;	
	notasAlunos[1][1]=10;		
	notasAlunos[1][2]=10;	
	notasAlunos[1][3]=9.5;	
	
	notasAlunos[2][0]=10;	
	notasAlunos[2][1]=7;		
	notasAlunos[2][2]=8;	
	notasAlunos[2][3]=9.5;	
	
	for (int i=0 ; i<notasAlunos.length ; i++) {
		//System.out.println(notasAlunos[i]+ " " );
		for (int j=0 ; j<notasAlunos[i].length ; j++) {
			System.out.println(notasAlunos[i][j]+ " " );
	
		}
		System.out.println();
	}
	System.out.println("Calculando a média de cada aluno: ");
	double soma;
	for(int i=0 ; i<notasAlunos.length ; i++) {
		
		soma=0;
	for(int j=0 ; j<notasAlunos[i].length ; j++) {	
	 soma+=notasAlunos[i][j];
	}
	System.out.println("Média do aluno " + i + " é = " +(soma/4));
	}
	}

}
