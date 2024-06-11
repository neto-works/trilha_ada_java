package org.example.padroes.singleton;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {

    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();
    private Map<String,Boolean> diasDisponiveis = new HashMap<>();

    public AgendaSingletonEAGER(){
        diasDisponiveis.put("Domingo",Boolean.TRUE);
        diasDisponiveis.put("Segunda",Boolean.TRUE);
        diasDisponiveis.put("Terça",Boolean.TRUE);
        diasDisponiveis.put("Quarta",Boolean.TRUE);
        diasDisponiveis.put("Quinta",Boolean.TRUE);
        diasDisponiveis.put("Sexta",Boolean.TRUE);
        diasDisponiveis.put("Sabado",Boolean.TRUE);
    }
    public static AgendaSingletonEAGER getInstance(){
        return INSTANCE;
    }
    public void ocupa (String dia){
        diasDisponiveis.replace(dia,Boolean.FALSE);
    }
    public Map<String,Boolean> getDias(){
        return diasDisponiveis;
    }
}
