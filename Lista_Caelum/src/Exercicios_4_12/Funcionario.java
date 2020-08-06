package Exercicios_4_12;

public class Funcionario {
   
	String nome, departamento, RG;
    
	Data dataEntrada;
    
    double salario;
    
    void bonifica(double aumento){
        this.salario += aumento;
    }
    
    double calculaGanhoAtual(){
        return (salario * 12);
    }
    
    void mostra(){
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de entrada: " + dataEntrada.dia + "/" + dataEntrada.mes +"/" + dataEntrada.ano);
        System.out.println("RG: " + this.RG);
        System.out.println("Salário: " + this.salario);
        System.out.println("Ganha anualmente: " + calculaGanhoAtual());
    }

}