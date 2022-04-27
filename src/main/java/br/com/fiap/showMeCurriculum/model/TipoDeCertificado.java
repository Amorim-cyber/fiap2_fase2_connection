package br.com.fiap.showMeCurriculum.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_tipo_cert")
public class TipoDeCertificado {
    @Id
    @SequenceGenerator(name="tipo_cert",sequenceName="sq_tbl_tipo_cert",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tipo_cert")
    @Column(name="id_tipo_cert")
    private int idTipoCert;

    @Column(name="nome_tipo_cert",nullable=false,length=100)
    private String nomeTipoCert;

    public TipoDeCertificado() {
    }

    public int getIdTipoCert() {
        return idTipoCert;
    }

    public void setIdTipoCert(int idTipoCert) {
        this.idTipoCert = idTipoCert;
    }

    public String getNomeTipoCert() {
        return nomeTipoCert;
    }

    public void setNomeTipoCert(String nomeTipoCert) {
        this.nomeTipoCert = nomeTipoCert;
    }
}
