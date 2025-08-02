package com.xyz.IntelliChef.repo;

import com.xyz.IntelliChef.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe, Integer> {
}
