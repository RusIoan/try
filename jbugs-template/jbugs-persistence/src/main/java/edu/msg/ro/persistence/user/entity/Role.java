package edu.msg.ro.persistence.user.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;

    @Column(nullable = false, length = 50)
    private String type;

    @ManyToMany
    List<Permission> permissions;

    public int getIdRole() {
        return idRole;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
