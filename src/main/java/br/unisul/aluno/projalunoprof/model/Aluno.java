package br.unisul.aluno.projalunoprof.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String endereco;

    public static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Aluno() {
    }

    public Aluno(String nome, String dataNascimento) {
        this.nome = nome;
        this.setDataNascimento(dataNascimento);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public String getDataFormatada(){
        return this.dataNascimento.format(FORMATO_DATA);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, FORMATO_DATA);
    }
}
