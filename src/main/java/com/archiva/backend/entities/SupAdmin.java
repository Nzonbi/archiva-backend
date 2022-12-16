package com.archiva.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class SupAdmin extends AppUser {
    @Id
    private String id;
    @OneToMany(mappedBy = "supAdmin")
    private List<Hospital> hospitalList;
}
