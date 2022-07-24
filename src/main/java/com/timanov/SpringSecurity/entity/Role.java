package com.timanov.SpringSecurity.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_role")
public class Role implements GrantedAuthority {

    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;


    @Setter
    @Getter
    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {

    }

    public Role (Long id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return getName();
    }
}
