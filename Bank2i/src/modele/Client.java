/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Chloé
 */
@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(
            name="ABSCISSE",
            nullable=false
    )
    private float abscisse;
    
    @Column(
            name="ORDONNEE",
            nullable=false     
    )
    private float ordonnee;
    
   @Column(name="CHIFFRE D'AFFAIRE CLIENT")
    private int CAc;
    
    @Column(name="EMPRUNT CLIENT")
    private int Ec;

    public Client() {
        this.abscisse = 0;
        this.ordonnee = 0;
        this.CAc=0;
        this.Ec=0;
        
    }

    public Client(float abscisse, float ordonnee, int CAc, int Ec) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.CAc = CAc;
        this.Ec = Ec;
    }

    public Long getId() {
        return id;
    }

    public float getAbscisse() {
        return abscisse;
    }

    public float getOrdonnee() {
        return ordonnee;
    }

    public int getCAc() {
        return CAc;
    }

    public int getEc() {
        return Ec;
    }

    public void setAbscisse(float abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(float ordonnee) {
        this.ordonnee = ordonnee;
    }

    public void setCAc(int CAc) {
        this.CAc = CAc;
    }

    public void setEc(int Ec) {
        this.Ec = Ec;
    }
    
    

    
    

 


    
}
