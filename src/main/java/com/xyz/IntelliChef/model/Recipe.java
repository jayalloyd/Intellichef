package com.xyz.IntelliChef.model;
import jakarta.persistence.*;
import lombok.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="recipe")
@EntityListeners(AuditingEntityListener.class)
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_entity_seq_gen")
    @SequenceGenerator(
            name = "my_entity_seq_gen",
            sequenceName = "my_entity_id_seq",
            allocationSize = 50
    )
    private int recipeNumber;
    private  String title;
    private String description;


//    private List<String> ingredients = new ArrayList<>();
//    private double ingredientQuantity;
    @CreatedDate
    private Date createdAt;


    @LastModifiedDate
    private Date updatedAt;

    private String category;
    private String userComments;

}
