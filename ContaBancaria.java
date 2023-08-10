public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private float saldoConta;

    public ContaBancaria(int numeroConta, String nomeTitular, float saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void depositoConta(float deposito) {
        if (deposito >= 0) {
            saldoConta += deposito;
            System.out.println("Novo saldo: " + saldoConta);
        } else {
            System.out.println("Informe um depósito válido");
        }

    }

    public void saqueConta(float saque) {
        if (saque > saldoConta) {
            System.out.println("Valor indisponível na conta. Saldo da conta: " + saldoConta);
        } else {
            saldoConta -= saque;
            System.out.println("Saque efetuado com sucesso. Saldo atual da conta: " + saldoConta);
        }
    }
}