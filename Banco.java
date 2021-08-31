public class Banco {
    String nomeBanco;
    int idBanco;

    public Banco(String nomeBanco, int idBanco) {
        this.nomeBanco = nomeBanco;
        this.idBanco = idBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }
}
