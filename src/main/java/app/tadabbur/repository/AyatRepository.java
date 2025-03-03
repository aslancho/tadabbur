package app.tadabbur.repository;

import app.tadabbur.model.embedded.AyatId;
import app.tadabbur.model.entity.Ayat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AyatRepository extends JpaRepository<Ayat, AyatId> {
    List<Ayat> findBySuraNumber(Integer suraNumber);
    Optional<Ayat> findBySuraNumberAndAyatNumber(Integer suraNumber, Integer ayatNumber);
    List<Ayat> findBySuraNumberIn(List<Integer> suraNumbers);
}