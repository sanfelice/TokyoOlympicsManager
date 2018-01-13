package com.tokyomanager.olympics.model;



import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Ricardo Sanfelice
 */
@Entity
public class Competition implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private Long id;
    
    private String modalidade;
    private String estadio;
    private Date dataHoraInicio;
    private Date dataHoraTermino;
    private String competidor1;
    private String competidor2;
    private String etapa;

    
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Date getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Date getDataHoraTermino() {
        return dataHoraTermino;
    }

    public void setDataHoraTermino(Date dataHoraTermino) {
        this.dataHoraTermino = dataHoraTermino;
    }

    public String getCompetidor1() {
        return competidor1;
    }

    public void setCompetidor1(String competidor1) {
        this.competidor1 = competidor1;
    }

    public String getCompetidor2() {
        return competidor2;
    }

    public void setCompetidor2(String competidor2) {
        this.competidor2 = competidor2;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
