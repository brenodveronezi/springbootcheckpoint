package com.brenodveronezi.desafiospringboot.service;

import com.brenodveronezi.desafiospringboot.model.Empresa;
import com.brenodveronezi.desafiospringboot.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public Empresa saveEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }
}
