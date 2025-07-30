package com.xyz.IntelliChef.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Ingredients")
public class Ingredients {
    @Id
    private  Long  id;
    private String ingredientName;
    private double ingredientQuantity;




}
