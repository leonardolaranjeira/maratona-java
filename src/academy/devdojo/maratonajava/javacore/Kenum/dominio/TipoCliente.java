package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    // Método de busca usado para achar uma enumeração específica catalogada através de um array
   public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
       for (TipoCliente tipoCliente : values()) {
           if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
               return tipoCliente;
           }
       }
       return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    // Enumeração é usada para atribuir valores determinados para os objetos criados pelas classes.
}
