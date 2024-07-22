package com.arimoura.rocketseat.atividadesRocketseat.horaDaVerdade_01;

import java.time.LocalDate;

public class Transacao {
    private LocalDate data;

    private String descricao;

    public Transacao(LocalDate data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

}
