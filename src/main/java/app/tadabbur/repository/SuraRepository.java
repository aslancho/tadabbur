package app.tadabbur.repository;

import app.tadabbur.model.entity.Sura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuraRepository extends JpaRepository<Sura, Integer> {
    List<Sura> findByNumberIn(List<Integer> suraNumbers);
}