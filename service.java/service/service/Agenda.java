package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Tarefa;

public class Agenda {
    private Map<String, List <Tarefa>> tarefaspordia;

    public Agenda(){
        this.tarefaspordia = new HashMap<>();
    }

    public void adcionarTarefa(String dia, Tarefa tarefa ){
        tarefaspordia.putIfAbsent(dia, new ArrayList<>());
        tarefaspordia.get(dia).add(tarefa);
    }

    public void removerTarefa(String dia, String descricao){
        
    }


}
