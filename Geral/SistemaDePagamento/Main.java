package Geral.SistemaDePagamento;
// Feito por Lucas Vieira e Kaua Ramos
public class Main {
    public static void main(String[] args) {

        Dinheiro PDinheiro = new Dinheiro(12.50f, "13/04/2026", "USD");
        CartaoCredito PCartaoCredito = new CartaoCredito(523.24f, "23/07/2025", "541117979844", "06/30");
        Cheque PCheque = new Cheque(57394.12f, "05/04/2007", "1086587963296", "Bradesco");
        PDinheiro.efetuar_pagamento();
        PCartaoCredito.efetuar_pagamento();
        PCheque.efetuar_pagamento();
    }
}