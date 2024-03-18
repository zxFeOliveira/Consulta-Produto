package com.consultaproduto.consultaproduto.domain;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="E075PRO")
public class E075pro implements Serializable {
    private static final long serialVersionUID = 6939667419912360931L;

    @EmbeddedId
    private E075proPK id;

    @Column(name="despro")
    private String despro;

    @Column(name="desnfv")
    private String desnfv;

    @Column(name="codori")
    private String codori;

    @Column(name="codfam")
    private String codfam;

    @Column(name="usu_desass")
    private String desass;

    @Column(name="usu_codloc")
    private String codloc;

    @Column(name="sitpro")
    private String sitpro;

    @Column(name="usu_dimalt")
    private Long dimAtl;

    @Column(name="usu_dimlar")
    private Long dimLar;

    @Column(name="usu_dimprf")
    private Long dimPrf;

    @Column(name="usu_codsts")
    private Long usu_codsts;

    @Column(name="usu_numpag")
    private Long numpag;

    @JsonInclude()
    @Transient
    private String usu_dessts;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name="codemp", referencedColumnName = "codemp", updatable = false, insertable = false),
            @JoinColumn(name="codpro", referencedColumnName = "codpro", updatable = false, insertable = false)
    })
    private List<E075der> e075der;

    public E075proPK getId() {
        return id;
    }

    public void setId(E075proPK id) {
        this.id = id;
    }

    public String getSitpro() {
        return sitpro;
    }

    public void setSitpro(String sitpro) {
        this.sitpro = sitpro;
    }

    public String getDespro() {
        return despro;
    }

    public void setDespro(String despro) {
        this.despro = despro;
    }

    public String getDesnfv() {
        return desnfv;
    }

    public void setDesnfv(String desnfv) {
        this.desnfv = desnfv;
    }

    public String getCodori() {
        return codori;
    }

    public void setCodori(String codori) {
        this.codori = codori;
    }

    public String getCodfam() {
        return codfam;
    }

    public void setCodfam(String codfam) {
        this.codfam = codfam;
    }

    public String getDesass() {
        return desass;
    }

    public void setDesass(String desass) {
        this.desass = desass;
    }

    public String getCodloc() {
        return codloc;
    }

    public void setCodloc(String codloc) {
        this.codloc = codloc;
    }

    public Long getDimAtl() {
        return dimAtl;
    }

    public void setDimAtl(Long dimAtl) {
        this.dimAtl = dimAtl;
    }

    public Long getDimLar() {
        return dimLar;
    }

    public void setDimLar(Long dimLar) {
        this.dimLar = dimLar;
    }

    public Long getDimPrf() {
        return dimPrf;
    }

    public void setDimPrf(Long dimPrf) {
        this.dimPrf = dimPrf;
    }

    public List<E075der> getE075der() {
        return e075der;
    }

    public void setE075der(List<E075der> e075der) {
        this.e075der = e075der;
    }

    public Long getUsu_codsts() {
        return usu_codsts;
    }

    public void setUsu_codsts(Long usu_codsts) {
        this.usu_codsts = usu_codsts;
    }

    public Long getNumpag() {
        return numpag;
    }

    public void setNumpag(Long numpag) {
        this.numpag = numpag;
    }

    public String getUsu_dessts() {

        switch (Long.toString(this.usu_codsts)) {
            case "1" : this.setUsu_dessts("Fora de publicação/catálogo");
                break;
            case "2" : this.setUsu_dessts("Ativo");
                break;
            case "3" : this.setUsu_dessts("Esgotado");
                break;
            case "5" : this.setUsu_dessts("Importado");
                break;
            case "9" : this.setUsu_dessts("Inativo");
                break;
            case "10" : this.setUsu_dessts("Edição desatualizada");
                break;
            case "11" : this.setUsu_dessts("Ponta de estoque");
                break;
            case "12" : this.setUsu_dessts("Didático");
                break;
            case "13" : this.setUsu_dessts("Pré-Cadastro");
                break;
            case "14" : this.setUsu_dessts("Produto de atacado");
                break;
            case "15" : this.setUsu_dessts("Liquidação");
                break;
            case "16" : this.setUsu_dessts("Produto em Falta Temporária");
                break;
            case "17" : this.setUsu_dessts("Pré-Venda");
                break;
        }

        return usu_dessts;
    }

    public void setUsu_dessts(String usu_dessts) {
        this.usu_dessts = usu_dessts;
    }

}