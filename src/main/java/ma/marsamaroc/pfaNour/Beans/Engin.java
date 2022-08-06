package ma.marsamaroc.pfaNour.Beans;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Engin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private String code;
    private int capacite;
    private int compteur;
    private boolean disponibilite;
    private String famille;
    private String nomEngin;

    public Engin() {}

    public Engin(String code, int capacite, int compteur, boolean disponibilite, String famille, String nomEngin) {
        this.code = code;
        this.capacite = capacite;
        this.compteur = compteur;
        this.disponibilite = disponibilite;
        this.famille = famille;
        this.nomEngin = nomEngin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getNomEngin() {
        return nomEngin;
    }

    public void setNomEngin(String nomEngin) {
        this.nomEngin = nomEngin;
    }


    @Override
    public String toString() {
        return "Engin{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", capacite=" + capacite +
                ", compteur=" + compteur +
                ", disponibilite=" + disponibilite +
                ", famille='" + famille + '\'' +
                ", nomEngin='" + nomEngin + '\'' +
                '}';
    }
}
