package br.unisul.aluno.projalunoprof.controller;


import br.unisul.aluno.projalunoprof.dto.AlunoDTO;
import br.unisul.aluno.projalunoprof.model.Aluno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {


    @GetMapping("/{id}")
    public AlunoDTO localizarAluno(@PathVariable(name = "id") Long id) {
        System.out.println(id);
        Aluno aluno = new Aluno();
        aluno.setNome("José Augusto");
        aluno.setDataNascimento("10/10/2001");
        AlunoDTO dto = new AlunoDTO(aluno);
        return dto;
    }

    @GetMapping
    public List<AlunoDTO> listarAluno() {
        List<AlunoDTO> alunoDTOS = new ArrayList<>();
        alunoDTOS.add(new AlunoDTO(new Aluno("José", "01/01/2020")));
        alunoDTOS.add(new AlunoDTO(new Aluno("Maria", "01/01/1980")));
        return alunoDTOS;
    }

    @PostMapping
    public void gravarAluno(@RequestBody AlunoDTO dto) {
        System.out.println(dto);

    }
}
