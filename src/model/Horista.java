package model;

public class Horista extends Funcionario{

    private float valorHora;
    private float totalHoras;

    public Horista(String cpf, String nome,
           float valorHora, float totalHoras) {
        super(cpf,nome);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(float totalHoras) {
        this.totalHoras = totalHoras;
    }

    @Override
    public float calcularPagamento(){
        return totalHoras*valorHora;
    }

}
