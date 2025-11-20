package hu.unideb.inf.bootstrap_cs122.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "persons")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    @Id
    @GeneratedValue
    Integer id;
    String firstName;
    String lastName;
    String email;
    String password;
    boolean enabled;
}
