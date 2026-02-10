package com.example.backend_server.models.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "Outfits_Info")
@NoArgsConstructor
@AllArgsConstructor
public class Outfit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Description;

    @Column(nullable = false)
    private Integer Rating;

    @Column(nullable = false)
    private Integer Size;

    @Column(nullable = false)
    private Double Price;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Material Material;

    @Column(nullable = false)
    private String ImageURL;
}
