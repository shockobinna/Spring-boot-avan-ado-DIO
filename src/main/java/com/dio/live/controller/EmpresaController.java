package com.dio.live.controller;

import java.util.List;
import java.util.Optional;

import com.dio.live.model.Empresa;
import com.dio.live.service.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    EmpresaService empresaService;

    @Autowired
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }
     @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.createEmpresa(empresa);
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }
    
    @GetMapping
    public List<Empresa> getAllEmpresa(){
        return empresaService.getAllEmpresa();
    }

    @DeleteMapping("/{id}")
    public void deleteEmpById(@PathVariable(value = "id")Long id){
         empresaService.deleteEmpById(id);
    }

    @GetMapping("/{id}")
    public Optional<Empresa> getEmpById(@PathVariable (value = "id")Long id){
        return empresaService.getEmpById(id);
    }
}
