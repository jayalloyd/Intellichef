package com.xyz.IntelliChef.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@EntityListeners(AuditingEntityListener.class)
public class RecipeDTO {
    @Id
    private int recipeNumber;
    private  String title;
    private String description;

    private String ingredientName;
    private double ingredientQuantity;
    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

    private String category;
    private String userComments;




}
