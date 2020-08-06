package Exercicios_4_12;

public class Executa {
	
	public static void main(String[] args) {
        
		Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        Data data = new Data();
        
        f1.nome = "Programador Java";
        f1.departamento = "TI";
        f1.RG = "123456789-0";
        f1.salario = 2000;
        f1.dataEntrada = data;
        f1.mostra();
        
        System.out.println("\nApós fazer o curso Java Progressivo, o funcionário obteve bonificação de mil reais.");
        System.out.println("Os novos dados, após o aumento, são:\n");
        f1.bonifica(1000);
        f1.mostra();
        
       
        f2.nome = "Programador Java";
        f2.departamento = "TI";
        f2.RG = "123456789-0";
        f2.salario = 2000;
        f2.bonifica(1000);
        
        if(f1 == f2){
            System.out.println("\nFuncionários 1 e 2 são iguais");
        } else {
            System.out.println("\nFuncionários 1 e 2 são diferentes");
        }
        
        Funcionario f3 = f1;
        if(f1 == f3){
            System.out.println("Funcionários 1 e 3 são iguais");
        } else {
            System.out.println("Funcionários 1 e 3 são diferentes");
        }
        
        System.out.println("Acessando e alterando os valores diretamente:");
        f1.salario = 1234;
        System.out.println(f1.calculaGanhoAtual());
    }
}
