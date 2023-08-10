import java.util.ArrayList;

public class AgenciaBancaria {
    private int numeroAgencia;
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public AgenciaBancaria(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void addContaBancaria(ContaBancaria conta) {
        contas.add(conta);
    }

    public void fazerDepositoConta(int numContaBancaria, float deposito) {
        contas.forEach(conta -> {
            if (conta.getNumeroConta() == numContaBancaria) {
                conta.depositoConta(deposito);
            }
        });
    }

    public void fazerSaqueConta(int numContaBancaria, float saque) {
        contas.forEach(conta -> {
            if (conta.getNumeroConta() == numContaBancaria) {
                conta.saqueConta(saque);
            }
        });
    }

}
