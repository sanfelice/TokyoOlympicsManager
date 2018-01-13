package com.tokyomanager.olympics.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

/**
 * This class serves as a model for competitions table
 * @author Ricardo Sanfelice
 */
@Entity
public class Competition implements Serializable {

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_sport")
    private Sport sport;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_site")
    private Site site;
    @Type(type = "timestamp")
    private Date dateTimeStart;
    @Type(type = "timestamp")
    private Date dateTimeEnd;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_country1")
    private Country country1;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_country2")
    private Country country2;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_stage")
    private Stage stage;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Date getDateTimeStart() {
        return dateTimeStart;
    }

    public void setDateTimeStart(Date dateTimeStart) {
        this.dateTimeStart = dateTimeStart;
    }

    public Date getDateTimeEnd() {
        return dateTimeEnd;
    }

    public void setDateTimeEnd(Date dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
    }

    public Country getCountry1() {
        return country1;
    }

    public void setCountry1(Country country1) {
        this.country1 = country1;
    }

    public Country getCountry2() {
        return country2;
    }

    public void setCountry2(Country country2) {
        this.country2 = country2;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }


}
