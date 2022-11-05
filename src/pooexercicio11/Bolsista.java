package pooexercicio11;

public class Bolsista extends Aluno {
    
    private int bolsa;
    
    public void renovarBolsa() {
        System.out.println("Bolsa renovada!");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("Desconto aplicado e mensalidade paga!");
    }

    public String toStringBolsa() {
        return "\nbolsa = " + bolsa;
    }
}
