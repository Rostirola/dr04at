package br.edu.infnet.at.repository;

import br.edu.infnet.at.entity.At;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtRepository extends JpaRepository<At, Long> {

}
