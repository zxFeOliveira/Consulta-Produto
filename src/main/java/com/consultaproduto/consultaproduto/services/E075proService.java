package com.consultaproduto.consultaproduto.services;

import com.consultaproduto.consultaproduto.domain.E075pro;
import com.consultaproduto.consultaproduto.domain.E075proPK;
import com.consultaproduto.consultaproduto.repositories.E075proRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class E075proService {

    @Autowired
    private E075proRepository e075proRepository;


    public E075pro buscar(E075proPK id) throws Exception {
        //E075pro produto = new E075pro();
        //produto.setId(id);

        Optional<E075pro> produto = e075proRepository.findById(id);

        return produto.orElseThrow(() -> new Exception("O produto não foi encontrado"));
    }

//    public void atualizar(E075pro e075pro) throws Exception {
//        verificarExistencia(e075pro);
//        e075proRepository.save(e075pro);
//    }

//    private void verificarExistencia(E075pro e075pro) throws Exception {
//        buscar(e075pro.getId());
//    }
}
