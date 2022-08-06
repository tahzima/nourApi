package ma.marsamaroc.pfaNour.Beans;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
@Entity
public class Navire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nomNavire;
    private String numeroNavire;
    private Date dateArrivee;
    private String marchandise;

     @Column(nullable = false, updatable = false)

     private String status;

    public Navire() {}

    public Navire(Date dateArrivee, String marchandise, String nomNavire, String numeroNavire, String status) {
        this.dateArrivee = dateArrivee;
        this.marchandise = marchandise;
        this.nomNavire = nomNavire;
        this.numeroNavire = numeroNavire;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomNavire() {
        return nomNavire;
    }

    public void setNomNavire(String nomNavire) {
        this.nomNavire = nomNavire;
    }

    public String getNumeroNavire() {
        return numeroNavire;
    }

    public void setNumeroNavire(String numeroNavire) {
        this.numeroNavire = numeroNavire;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public String getMarchandise() {
        return marchandise;
    }

    public void setMarchandise(String marchandise) {
        this.marchandise = marchandise;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Navire{" +
                "id=" + id +
                ", nomNavire='" + nomNavire + '\'' +
                ", numeroNavire='" + numeroNavire + '\'' +
                ", dateArrivee=" + dateArrivee +
                ", marchandise='" + marchandise + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
