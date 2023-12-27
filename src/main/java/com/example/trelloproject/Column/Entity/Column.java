package com.example.trelloproject.Column.Entity;


import com.example.trelloproject.Card.Entity.Card;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Column {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToMany(mappedBy = "columnList", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Card> cards = new LinkedHashSet<>();

}
