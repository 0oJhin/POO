package atv09_colecoes;

import java.util.Objects;

public class Cliente {
    private String nome;
    public Cliente(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public String toString(){
        return "Cliente : "+ getNome();
    }
    @Override
    public boolean equals(Object obj) {

    if (this == obj) {
        return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }

    Cliente cliente = (Cliente) obj;

    return Objects.equals(nome, cliente.nome);
    }
    @Override
    public int hashCode() {
    return Objects.hash(nome);
    }

}
