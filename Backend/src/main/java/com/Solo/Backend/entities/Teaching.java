package com.Solo.Backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "docentes")
public class Teaching { 
    @Id
    @Column(name = "iddocente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer teachingId;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario", nullable = false,  foreignKey = @ForeignKey(name = "fk_docente_usuario"))
    private User user;

    @Column(name = "estado", nullable = false, columnDefinition = "boolean default true")
    private Boolean state = true;
}
