package com.cgi.dentistapp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dentist_visit")
public class DentistVisitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="name", nullable=false)
    private DentistEntity name;

    private LocalDateTime dateTime;

    public DentistVisitEntity() { }

    public DentistVisitEntity(Long id, DentistEntity name, LocalDateTime dateTime) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
    }

    public DentistVisitEntity(DentistEntity name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DentistEntity getName() {
        return name;
    }

    public void setName(DentistEntity name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
