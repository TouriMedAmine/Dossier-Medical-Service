package com.repository;
import com.entities.DossierMedical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierMedicalRepository extends JpaRepository<DossierMedical, Long> {
	@Query("select dm from DossierMedical dm where dm.cin like :x")
	DossierMedical trouverDossierMedicalParCin(@Param("x")String cin);
}
