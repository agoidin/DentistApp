package com.cgi.dentistapp.repository;

import com.cgi.dentistapp.entity.DentistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DentistRepository
        extends JpaRepository<DentistEntity, Long> {

    @Query(
            value = "SELECT name FROM Dentists",
            nativeQuery = true
    )
    List<String> getAllNames();
}
