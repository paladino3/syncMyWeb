package Aula05;

import java.util.Scanner;

public class ContaBancoGenerico {

public static void main(String[] args) {

ContaBanco conta = new ContaBanco (123, null,"Wesley rolim", 0, false);

conta.pagarMensalidade();
conta.status();

}
}

