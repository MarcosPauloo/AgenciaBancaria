public class Gerenciamento {
    public static void main(String[] args) {
        ContaBancaria cont1 = new ContaBancaria(1, "Marcos Paulo", 200000);
        ContaBancaria cont2 = new ContaBancaria(2, "Joao", 300000);
        ContaBancaria cont3 = new ContaBancaria(3, "Everton", 400000);
        ContaBancaria cont4 = new ContaBancaria(4, "Luís", 500000);

        AgenciaBancaria agencia1 = new AgenciaBancaria(123);
        agencia1.addContaBancaria(cont1);
        agencia1.addContaBancaria(cont2);

        AgenciaBancaria agencia2 = new AgenciaBancaria(321);
        agencia2.addContaBancaria(cont3);
        agencia2.addContaBancaria(cont4);

        // realizar saque valido na conta 1
        agencia1.fazerSaqueConta(1, 3000);
        // realizando saque invalido na conta 1
        agencia1.fazerSaqueConta(1, 300000);

        // relizando um deposito na conta 4
        agencia2.fazerDepositoConta(4, 200000);

        // deposito e saque na conta 3
        agencia2.fazerDepositoConta(3, 3000);
        agencia2.fazerSaqueConta(3, 3000);
    }
}
