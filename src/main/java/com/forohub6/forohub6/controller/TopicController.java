package com.forohub2024.forohub2024.controller;


import com.forohub2024.forohub2024.dto.TopicoRegistrarDato;
import com.forohub2024.forohub2024.model.Topico;
import com.forohub2024.forohub2024.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/topico")
public class TopicController {
    @Autowired
    TopicoRepository topicoRepository;


    @PostMapping
    public void registrarTopico(@RequestBody @Valid TopicoRegistrarDato topicoRegistrarDato){
        topicoRepository.save(new Topico (topicoRegistrarDato));
    }
}
