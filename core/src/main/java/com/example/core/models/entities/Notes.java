package com.example.core.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_notes")
public class Notes extends BaseEntity{

    @Column(name = "title")
    private String title;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "tb_users_id")
    Users users;
}
