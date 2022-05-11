package com.example.springjpademo.utils;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "admin")
public class Admin{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    @OneToMany(targetEntity = User.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "adminId")
    @JsonManagedReference
    private Collection<User> users;
}