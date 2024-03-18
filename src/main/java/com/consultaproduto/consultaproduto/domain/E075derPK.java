package com.consultaproduto.consultaproduto.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

//@Embeddable
@Embeddable
public class E075derPK implements Serializable  {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String codpro;

    private Integer codemp;

    private String codder;

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public Integer getCodemp() {
        return codemp;
    }

    public void setCodemp(Integer codemp) {
        this.codemp = codemp;
    }

    public String getCodder() {
        return codder;
    }

    public void setCodder(String codder) {
        this.codder = codder;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codpro == null) ? 0 : codpro.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        E075derPK other = (E075derPK) obj;
        if (codpro == null) {
            if (other.codpro != null)
                return false;
        } else if (!codpro.equals(other.codpro))
            return false;
        return true;
    }



}
