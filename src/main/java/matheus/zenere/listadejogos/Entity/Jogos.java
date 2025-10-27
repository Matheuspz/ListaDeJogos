package matheus.zenere.listadejogos.Entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Jogos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    @Column(unique=true, nullable=false)
    private String titulo;
    @Column(nullable=false)
    private String descricao;
    @Column(nullable=false)
    private LocalDate dataLancamento;

    public Jogos() {
    }
    public Jogos(long id, String titulo, String descricao, LocalDate dataLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLancamento = dataLancamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
