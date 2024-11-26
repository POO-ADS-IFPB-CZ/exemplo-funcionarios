package view;

import model.Funcionario;
import model.Horista;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Horista("111.111.111-01",
                "João", 40, 60);
        Funcionario funcionario1 = new Horista("111.111.111-01",
                "João", 40, 60);

        System.out.println(funcionario1.equals(funcionario));


    }
}