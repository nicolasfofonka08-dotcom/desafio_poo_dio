package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Contedo{

    private LocalDate dataprivate ;

    @Override
    public double calcularXP() {
        return xp_padrao + 20;
    }


    public LocalDate getDataprivate() {
        return dataprivate;
    }

    public void setDataprivate(LocalDate dataprivate) {
        this.dataprivate = dataprivate;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataprivate=" + dataprivate +
                '}';
    }

}
