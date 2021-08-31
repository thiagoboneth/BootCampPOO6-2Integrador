public class Cliente extends Conta {
    Boolean transacaoOk = true;
    Boolean transacaoNaoOk = false;

    public Cliente(String nomeBanco, int idBanco, String agencia, String contaCorrente, String nomeDoTitular, String cpf, double saldo, String tipo) {
        super(nomeBanco, idBanco, agencia, contaCorrente, nomeDoTitular, cpf, saldo, tipo);
    }

    public void depositaNaConta() {
        if (getTipo().equals("executivo")) {
            System.out.println(nomeDoTitular + " pode depositar na conta: " + transacaoOk);
        } else {
            System.out.println(nomeDoTitular + " pode depositar na conto: " + transacaoNaoOk);
        }
    }

    public void transfereParaOutraConta() {
        if (getTipo().equals("executivo")) {
            System.out.println(nomeDoTitular + " pode entre transferir entre contas: " + transacaoOk);
        } else {
            System.out.println(nomeDoTitular + " não pode entre transferir entre contas: " + transacaoNaoOk);
        }
    }

    public void saqueDaConta() {
        if (getTipo().equals("basico") || getTipo().equals("coletores")) {
            System.out.println(nomeDoTitular + " pode sacar dinheiro da conta: " + transacaoOk);
        } else {
            System.out.println(nomeDoTitular + " não pode sacar dinheiro da conta: " + transacaoNaoOk);
        }
    }

    public void consultaSaldo() {
        if (getTipo().equals("basico") || getTipo().equals("coletores")) {
            System.out.println(nomeDoTitular + " pode consultar saldo: " + transacaoOk);
        } else {
            System.out.println(nomeDoTitular + " não pode consultar saldo: " + transacaoNaoOk);
        }
    }

    public void pagamentoDeServicos() {
        if (getTipo().equals("basico")) {
            System.out.println(nomeDoTitular + " pode pagar serviços: " + transacaoOk);
        } else {
            System.out.println(nomeDoTitular + " não pode pagar serviços: " + transacaoNaoOk);
        }
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }
}
