package com.fabyane.curriculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fabyane.curriculos.model.Curriculo;
import com.fabyane.curriculos.repository.CurriculoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    public List<Curriculo> getAllCurriculos() {
        return curriculoRepository.findAll();
    }

    public Optional<Curriculo> getCurriculoById(Long id) {
        return curriculoRepository.findById(id);
    }

    public Curriculo saveCurriculo(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public void deleteCurriculo(Long id) {
        curriculoRepository.deleteById(id);
    }
}
