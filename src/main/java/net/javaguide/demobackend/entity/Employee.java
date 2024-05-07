package net.javaguide.demobackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "first_name",nullable = false)
    private String firstname;
    @Column(name = "last_name" ,nullable = false)
    private String lastname;
    @Column(name = "email",nullable = false,unique = true)
    private String email;
}
