package com.consultaproduto.consultaproduto.domain;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="E075DER")
public class E075der implements Serializable {

    /**
     *  teste git
     */
    private static final long serialVersionUID = 2002267764096464680L;

    @EmbeddedId
    private E075derPK id;

    private String codba2;

    private Integer codpdv;

    private String sitder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name="codemp", referencedColumnName = "codemp", updatable = false, insertable = false),
            @JoinColumn(name="codpro", referencedColumnName = "codpro", updatable = false, insertable = false)
    })
    @JsonIgnore
    private E075pro e075pro;


    public E075derPK getId() {
        return id;
    }

    public void setId(E075derPK id) {
        this.id = id;
    }

    public E075pro getE075pro() {
        return e075pro;
    }

    public void setE075pro(E075pro e075pro) {
        this.e075pro = e075pro;
    }


    public String getCodba2() {
        return codba2;
    }

    public void setCodba2(String codba2) {
        this.codba2 = codba2;
    }

    public Integer getCodpdv() {
        return codpdv;
    }

    public void setCodpdv(Integer codpdv) {
        this.codpdv = codpdv;
    }

    public String getSitder() {
        return sitder;
    }

    public void setSitder(String sitder) {
        this.sitder = sitder;
    }
}
