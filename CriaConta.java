public class CriaConta {

    public static class CriarConta {
        public static void main(String[] args) {
            Cliente fulano = new Cliente(
                    "Mercado Pago",
                    323,
                    "0001",
                    "00000000011",
                    "Carlos Magno",
                    "267.239.190-20",
                    1000000,
                    "Executivo"
            );

            fulano.imprimeDadosDoCliente("00000000011");

            fulano.deposita(500000);

            System.out.println("--- Novo saldo ---");
            fulano.saldo();

            fulano.imprimeDadosDoCliente("00000000011");

            System.out.println();

            fulano.consultaSaldo();
            fulano.depositaNaConta();
            fulano.transfereParaOutraConta();
            fulano.pagamentoDeServicos();
            fulano.saqueDaConta();

            System.out.println();

            Cliente bertrano = new Cliente(
                    "Mercado Pago",
                    323,
                    "0001",
                    "00000000012",
                    "Bertrano Costa",
                    "222.444.666-88",
                    12456,
                    "basico"
            );

            bertrano.imprimeDadosDoCliente("00000000012");

            bertrano.deposita(857);

            System.out.println("--- Novo saldo ---");
            bertrano.saldo();

            bertrano.imprimeDadosDoCliente("00000000012");

            System.out.println();

            bertrano.consultaSaldo();
            bertrano.depositaNaConta();
            bertrano.transfereParaOutraConta();
            bertrano.pagamentoDeServicos();
            bertrano.saqueDaConta();

            Cliente ciclano = new Cliente(
                    "Mercado Pago",
                    323,
                    "0001",
                    "00000000013",
                    "Jaime Monteiro",
                    "888.333.111-22",
                    45000,
                    "coletores"
            );

            ciclano.imprimeDadosDoCliente("00000000013");

            ciclano.deposita(897000);

            System.out.println("--- Novo saldo ---");
            ciclano.saldo();

            ciclano.imprimeDadosDoCliente("00000000013");

            System.out.println();

            ciclano.consultaSaldo();
            ciclano.depositaNaConta();
            ciclano.transfereParaOutraConta();
            ciclano.pagamentoDeServicos();
            ciclano.saqueDaConta();

        }
    }
}