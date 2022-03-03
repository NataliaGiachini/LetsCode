public class Pessoa {

    String nome;
    String endereço;
    String telefone;


    public String getNome() {return nome;}
    public String getEndereço() {
        return endereço;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public Pessoa(){}
    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + nome + '\'' +
                ", Endereço:'" + endereço + '\'' +
                ", Telefone:'" + telefone + '\'' +
                '}';
    }
}
