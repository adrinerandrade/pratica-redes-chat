package model;

public enum GameStatus {

    /**
     * Aguardando início da próxima rodada
     */
    IDLE,
    /**
     * Jogando e aguardando a próxima rodada para jogar
     */
    PLAYING,
    /**
     * Jogando e pedindo cartas (mantém-se no máximo 20 seg)
     */
    GETTING,
    /**
     * Jogando e aguardando o final da rodada
     */
    WAITING

}
