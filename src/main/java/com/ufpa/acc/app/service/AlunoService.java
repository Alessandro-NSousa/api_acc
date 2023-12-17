package com.ufpa.acc.app.service;

import com.ufpa.acc.app.domain.Certificado;
import com.ufpa.acc.app.domain.ValidacaoException;
import com.ufpa.acc.app.repository.AlunoRepository;
import com.ufpa.acc.app.repository.CertificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CertificadoRepository certificadoRepository;

//    public List<Certificado> listarCertificadosPorAluno(Long idAluno){
//       if (!alunoRepository.existsById(idAluno)){
//           throw new ValidacaoException("Id do Aluno informado não existe");
//       }
//
//       var aluno = alunoRepository.getReferenceById(idAluno);
//
//       return certificadoRepository.findCertificadoByAluno_Id(aluno.getId());
//
//    }
}
