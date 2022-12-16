package com.archiva.backend.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Patient extends AppUser {
    @Id
    private  String id;
    @OneToMany(mappedBy = "patient")
    private List<Consultation> consultationList;
}