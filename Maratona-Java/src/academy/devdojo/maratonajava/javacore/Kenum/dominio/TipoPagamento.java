package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        // 10% de desconto
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.10;
        }
    }, CREDITO {
        // 5% de desconto
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}
