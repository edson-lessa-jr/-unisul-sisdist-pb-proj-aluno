package br.unisul.aluno.projalunoprof.dto;

import br.unisul.aluno.projalunoprof.model.Aluno;

public class DadosBasicoAlunoDTO {
    private Long id;
    private String nome;

    public DadosBasicoAlunoDTO() {
    }


    public DadosBasicoAlunoDTO(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
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
}
