package com.xyz.IntelliChef.service;

import com.xyz.IntelliChef.model.Recipe;
import com.xyz.IntelliChef.repo.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements  RecipeService {

    @Autowired
    private RecipeRepo recipeRepo;



    public Recipe postARecipe(Recipe recipe) {
     Recipe recipeToDb= this.recipeRepo.save(recipe);
     return recipeToDb;
    }

//    @Override
//    public Recipe createARecipe(Recipe recipe) {
//      Recipe recipe1=new Recipe();
//      recipe1.setTitle("chicken Biriyani");
//
//
//        recipeRepo.save();
//        return recipe;
//    }
}
