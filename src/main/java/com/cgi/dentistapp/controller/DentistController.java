package com.cgi.dentistapp.controller;

import com.cgi.dentistapp.entity.DentistEntity;
import com.cgi.dentistapp.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/dentists")
public class DentistController {

    private final DentistService dentistService;

    @Autowired
    public DentistController(DentistService dentistService) { this.dentistService = dentistService; }

    @GetMapping
    public List<DentistEntity> getDentists() {
        return dentistService.getDentists();
    }

    @GetMapping("/names")
    public List<String> getAllNames() {
        return dentistService.getDentistsNames();
    }

}
