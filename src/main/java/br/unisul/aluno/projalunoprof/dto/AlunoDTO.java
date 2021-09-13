package br.unisul.aluno.projalunoprof.dto;


import br.unisul.aluno.projalunoprof.model.Aluno;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AlunoDTO {
    private String nome;
    private String dataNascimento;

    public AlunoDTO(){}

    public AlunoDTO(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public AlunoDTO(Aluno aluno) {
        this.nome = aluno.getNome();
        this.dataNascimento = aluno.getDataFormatada();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "AlunoDTO {\n" +
                "Nome =" + nome + "\n" +
                ", Data Nascimento=" + dataNascimento +"\n"+
                '}';
    }
}
