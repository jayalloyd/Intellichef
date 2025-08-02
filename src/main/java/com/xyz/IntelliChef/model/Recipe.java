package com.xyz.IntelliChef.model;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
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
