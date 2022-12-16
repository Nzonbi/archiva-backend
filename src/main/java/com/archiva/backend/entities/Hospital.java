package com.archiva.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Hospital {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String nameHospital;
    private String pays;
    private String region;
    private String town;

    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctorList;

    @ManyToOne
    private SupAdmin supAdmin;
}
