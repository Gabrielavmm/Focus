package model;
public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa( String descricao){
        this.descricao = descricao;
        this.concluido = false;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean isConcluido(){
        return concluido;
    }

    public void marcarConcluido(){
        this.concluido = true;
    }

    @Override
    public String toString() {
        return (concluido ? "[X] " : "[ ] ") + descricao;
    }

}
