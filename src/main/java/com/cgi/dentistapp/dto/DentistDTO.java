package com.cgi.dentistapp.dto;

public class DentistDTO {
    private String name;

    public DentistDTO() { }

    public DentistDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
