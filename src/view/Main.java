package view;

import model.Comissionado;
import model.Funcionario;
import model.Horista;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionarios[] = {
            new Horista("111.111.111-01", "João",
                    50, 80),
            new Horista("222.222.222-02","Maria",
                    60, 40),
            new Comissionado("333.333.333-03", "José",
                    0.03f, 50000),
            new Comissionado("444.444.444-04", "Ana",
                    0.03f, 40000)
        };

        float total = 0;
        for(Funcionario funcionario : funcionarios){
            total+=funcionario.calcularPagamento();
        }
        System.out.println(total);

    }
}