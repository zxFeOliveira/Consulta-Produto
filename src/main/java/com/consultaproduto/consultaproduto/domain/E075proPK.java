package com.consultaproduto.consultaproduto.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class E075proPK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Long codemp;
    private String codpro;

    public Long getCodemp() {
        return codemp;
    }
    public void setCodemp(Long codemp) {
        this.codemp = codemp;
    }

    public String getCodpro() {
        return codpro;
    }
    public void setCodpro(String codpro) {
        this.codpro = codpro;
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
        E075proPK other = (E075proPK) obj;
        if (codpro == null) {
            if (other.codpro != null)
                return false;
        } else if (!codpro.equals(other.codpro))
            return false;
        return true;
    }
}
