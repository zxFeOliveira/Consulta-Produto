package com.consultaproduto.consultaproduto.services;

import java.util.Optional;

import com.consultaproduto.consultaproduto.domain.E075derPK;
import com.consultaproduto.consultaproduto.repositories.E075derRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.consultaproduto.consultaproduto.domain.E075der;

@Service
public class E075derService {

    @Autowired
    private E075derRepository e075derRepository;

    public Optional<E075der> buscar(String codpro) throws Exception {

        E075derPK e075derPK = new E075derPK();
        Optional<E075der> e075der;

        e075derPK.setCodpro(codpro);

        e075der = e075derRepository.findById(e075derPK);

        if(e075der == null) {
            throw new Exception("A derivação não foi encontrada");
        }

        return e075der;
    }

    public E075der buscarBarra(String codbar) {

        E075der e075der = new E075der();

        e075der = e075derRepository.findTopDistinctCodproByCodba2(codbar);

        return e075der;

    }

}