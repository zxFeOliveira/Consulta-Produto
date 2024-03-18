package com.consultaproduto.consultaproduto.controllers;

import com.consultaproduto.consultaproduto.domain.E075pro;
import com.consultaproduto.consultaproduto.domain.E075proPK;
import com.consultaproduto.consultaproduto.services.E075derService;
import com.consultaproduto.consultaproduto.services.E075proService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/produtos")
public class E075proController {

    @Autowired
    private E075proService e075proService;

    private CacheControl cacheControl = CacheControl.maxAge(1, TimeUnit.SECONDS);

    @CrossOrigin
    @RequestMapping(value = "/{codemp}/{codpro}", method = RequestMethod.GET)
    public ResponseEntity<E075pro> buscar(@PathVariable Long codemp, @PathVariable String codpro){
        E075proPK idProduto = new E075proPK();

        idProduto.setCodemp(codemp);
        idProduto.setCodpro(codpro);

        E075pro produto = null;
        try {
            produto = e075proService.buscar(idProduto);
        } catch (Exception e) {
            throw new RuntimeException("Produto não encontrado: " + e.getMessage());
        }

        return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(produto);
    }

}
