package br.com.fiap.showMeCurriculum.repository;

import br.com.fiap.showMeCurriculum.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillRepository extends JpaRepository<Skill,Integer> {
    Optional<Skill> findByNomeSkill(String nome);
}
