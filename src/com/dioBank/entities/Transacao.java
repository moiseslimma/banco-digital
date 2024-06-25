package com.dioBank.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private TipoTransacao tipo;
    private double valor;
    private LocalDateTime dataHora;

    public Transacao(TipoTransacao tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return String.format("%s - %s - %.2f", dataHora.format(formatter), tipo, valor);
    }
}
