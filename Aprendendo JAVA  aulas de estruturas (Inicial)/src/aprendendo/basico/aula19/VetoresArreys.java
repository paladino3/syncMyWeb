package aprendendo.basico.aula19;

public class VetoresArreys {

	public static void main(String[] args) {
	
		
		double tempDia001=31.5;
		
		double [] temperaturas = new double [365];
		temperaturas[0]=31.5;
		temperaturas[1]=33;
		temperaturas[2]=31.8;
		temperaturas[3]=38.5;
		temperaturas[4]=34.5;
		temperaturas[5]=32.0;
		
		
		

		
		
		
		for (int i=0 ; i <temperaturas.length ; i++) {
			System.out.println("O valor da temperatura do dia "+ (i+1)+" é: "+temperaturas[i]);
		}
		
	}

}
