package model;

public class Comissionado extends Funcionario{

    private float comissao;
    private float totalVendas;

    public Comissionado(String cpf, String nome,
            float comissao, float totalVendas){
        super(cpf, nome);
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public float calcularPagamento(){
        return totalVendas*comissao;
    }

}
