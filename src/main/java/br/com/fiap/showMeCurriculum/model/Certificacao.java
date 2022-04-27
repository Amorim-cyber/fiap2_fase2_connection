package br.com.fiap.showMeCurriculum.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_certificacao")
public class Certificacao {

    @Id
    @SequenceGenerator(name="certificacao",sequenceName="sq_tbl_certificacao",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="certificacao")
    @Column(name="id_certificacao")
    private int idCertificacao;

    @Column(name="cd_certificacao",nullable=false,length=100)
    private String cdCandidato;

    @Column(name="dt_conclusao",nullable=false,length=8)
    private String dtConclusao;

    public Certificacao() {
    }

    public int getIdCertificacao() {
        return idCertificacao;
    }

    public void setIdCertificacao(int idCertificacao) {
        this.idCertificacao = idCertificacao;
    }

    public String getCdCandidato() {
        return cdCandidato;
    }

    public void setCdCandidato(String cdCandidato) {
        this.cdCandidato = cdCandidato;
    }

    public String getDtConclusao() {
        return dtConclusao;
    }

    public void setDtConclusao(String dtConclusao) {
        this.dtConclusao = dtConclusao;
    }
}
