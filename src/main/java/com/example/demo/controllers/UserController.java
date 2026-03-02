package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Departamento;
import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.DepartamentoRepository;
import com.example.demo.repositories.FuncionarioRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    
    @Autowired
    private DepartamentoRepository departamentoRepository;

    // Rota para listar todos os funcionários
    @GetMapping
    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    // Rota para salvar um novo funcionário
    @PostMapping
    public Funcionario insert(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
    
    // Rota para listar departamentos (para teste)
    @GetMapping(value = "/departamentos")
    public List<Departamento> findDeptos() {
        return departamentoRepository.findAll();
    }
}