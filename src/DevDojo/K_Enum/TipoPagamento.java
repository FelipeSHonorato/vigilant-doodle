package DevDojo.K_Enum;

public enum TipoPagamento {
    CREDITO(1, "Crédito"){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    },
    DEBITO(2, "Débito"){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    };


    private int valor;
    private String nomePagamento;


    public abstract double calcularDesconto(double valor);

    public int getValor() {
        return valor;
    }

    public String getNomePagamento() {
        return nomePagamento;
    }

    TipoPagamento(int valor, String nomePagamento) {
        this.valor = valor;
        this.nomePagamento = nomePagamento;


    }
}



