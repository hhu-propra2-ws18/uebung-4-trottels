package de.hhu.propra.db.data;

import de.hhu.propra.db.entities.Kunde;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface KundeRepository extends CrudRepository<Kunde, Long> {

    List<Kunde> findTop10By();

    List<Kunde> findByAutosFarbe(String farbe);
}
