package br.com.fiap.showMeCurriculum.repository;

import br.com.fiap.showMeCurriculum.model.Certificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CertificadoRepository extends JpaRepository<Certificacao,Integer> {

    Optional<Certificacao> findByNumeroCdCertificacao(String codigo);
}
