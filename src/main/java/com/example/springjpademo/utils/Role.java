package com.example.springjpademo.utils;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import lombok.*;
import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "role")
@JsonIdentityInfo(generator = JSOGGenerator.class)
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;
    //@JsonManagedReference
    @ManyToMany(targetEntity = User.class, mappedBy = "roles")
    private Collection<User> users;
}