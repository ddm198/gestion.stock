package com.gestion.stock.gestion.stock.jpa;

        import com.gestion.stock.gestion.stock.model.Utilisateur;
        import org.springframework.data.jpa.repository.JpaRepository;


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
