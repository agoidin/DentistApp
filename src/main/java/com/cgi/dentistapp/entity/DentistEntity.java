package com.cgi.dentistapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Dentists")
public class DentistEntity {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "name")
    private List<DentistVisitEntity> dentistVisitEntities;

    public DentistEntity() {
    }

    public DentistEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DentistEntity(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
