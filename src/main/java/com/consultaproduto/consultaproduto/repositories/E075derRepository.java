package com.consultaproduto.consultaproduto.repositories;

import com.consultaproduto.consultaproduto.domain.E075der;
import com.consultaproduto.consultaproduto.domain.E075derPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface E075derRepository extends JpaRepository<E075der, E075derPK> {
    List<E075der> findByIdCodpro(E075der e075der);

    E075der findTopDistinctCodproByCodba2(String codbar);
}
