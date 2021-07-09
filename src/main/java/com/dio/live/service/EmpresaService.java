package com.dio.live.service;

import java.util.List;
import java.util.Optional;

import com.dio.live.model.Empresa;
import com.dio.live.repository.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa createEmpresa(Empresa empresa){

        return empresaRepository.save(empresa);
        
    }

    public List<Empresa> getAllEmpresa(){
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getEmpById (Long id){
        return empresaRepository.findById(id);
    }

    public Empresa updateEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }
    
    public void deleteEmpById(Long id){
         empresaRepository.deleteById(id);
    }
}
