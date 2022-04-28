package br.com.fiap.showMeCurriculum.controller.resource;

import br.com.fiap.showMeCurriculum.exceptions.BusinessException;
import br.com.fiap.showMeCurriculum.exceptions.NotFoundException;
import br.com.fiap.showMeCurriculum.model.Certificacao;
import br.com.fiap.showMeCurriculum.repository.CertificadoRepository;
import br.com.fiap.showMeCurriculum.util.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("certificacao")
public class CertificacaoResource {
    @Autowired
    private CertificadoRepository certificadoRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Certificacao> findAll(){
        return certificadoRepository.findAll();
    }

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Certificacao findById(@PathVariable int id){
        return certificadoRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @GetMapping(value="/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Certificacao findByNumeroAndCep(@PathVariable String codigo){
        return certificadoRepository.findByNumeroCdCertificacao(codigo).orElseThrow(NotFoundException::new);
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Certificacao save(@RequestBody Certificacao certificacao){

        Optional<Certificacao> condominioOptional =
                certificadoRepository.findByNumeroCdCertificacao(certificacao.getCdCertificacao());

        if(condominioOptional.isPresent())
            throw new BusinessException(MessageUtils.CERTIFICACAO_ALREADY_EXISTS);

        return certificadoRepository.save(certificacao);
    }
}
