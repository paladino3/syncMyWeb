package Exercicios_5_05;

public class Executa {
	
	public static void main(String[] args) {
        Empresa JP = new Empresa("Java Progressivo", "12345\n");
        
        for (int i = 0; i < 10; i++) {
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            f.numero = i+1;
            JP.adiciona(f);
        }
        System.out.println("Método mostraEmpregados:\n");
        JP.mostraEmpregados();
        
        System.out.println("\nUsando o método 'mostra', de cada funcionário:\n");
        for(int i=0 ; i < JP.empregados.length ; i++){
            JP.empregados[i].mostra();
        }
        
        Funcionario f7 = new Funcionario();
        Funcionario f11 = new Funcionario();
        f7.numero = 7;
        f11.numero = 11;
        System.out.println("\nContém o funcionario 7? : " + JP.contem(f7));
        System.out.println("Contém o funcionario 11? : " + JP.contem(f11));
        
        Funcionario[] empregados2 = new Funcionario[11];
        
        for(int i=0 ; i < JP.empregados.length ; i++){
            empregados2[i] = JP.empregados[i];
        }
        
       empregados2[10] = f11;

       System.out.println("\nContém o funcionario 11? : " + JP.contem(f11));
        
       System.out.println("\nUsando o método 'mostra', de cada funcionário:");
        for(int i=0 ; i < empregados2.length ; i++){
            empregados2[i].mostra();
        }
        

        
    }

}
