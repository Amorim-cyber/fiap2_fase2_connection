package br.com.fiap.showMeCurriculum.exceptions;

import br.com.fiap.MoradoresPrestadores.util.MessageUtils;

public class NotFoundException extends RuntimeException{
    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
