package com.example.springjpademo.utils;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import lombok.*;
import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
@JsonIdentityInfo(generator = JSOGGenerator.class)
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name = "name", unique = true, nullable = false, length = 64)
    private String username;
    @JoinColumn(name = "adminId", referencedColumnName = "adminId")
    @ManyToOne
    private Admin adminId;
    @ManyToMany(targetEntity = Role.class)
    @JoinTable(name = "role2user", joinColumns = {@JoinColumn(name = "userId", referencedColumnName = "userId")},
            inverseJoinColumns = {@JoinColumn(name = "roleId", referencedColumnName = "roleId")})
    private Collection<Role> roles;
}