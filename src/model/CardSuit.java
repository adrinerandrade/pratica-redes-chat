package model;

public enum CardSuit {

    CLUB(" de Paus"),
    HEART(" de Copas"),
    DIAMOND(" de Ouros"),
    SPADE(" de Espadas");

    private final String descricao;

    private CardSuit(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
