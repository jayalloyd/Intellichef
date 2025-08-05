package com.xyz.IntelliChef.controller;

import com.xyz.IntelliChef.model.Recipe;
import com.xyz.IntelliChef.service.RecipeService;
import com.xyz.IntelliChef.service.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {


    @Autowired
    private RecipeServiceImpl recipeServiceImpl;
//   @GetMapping("/recipes")
//    public List<Recipe> getAllRecipes() {
//        return recipeService.getAllRecipes(); // <-- Returns the List directly
//    }


    @PostMapping("/recipe")
   public ResponseEntity<Recipe>addRecipe(@RequestBody Recipe recipe){
        Recipe recipeCreated = this.recipeServiceImpl.postARecipe(recipe);
        return new ResponseEntity<Recipe>(recipeCreated, HttpStatus.CREATED);
    }


//    @PostMapping("/createRecipe")
//    public Recipe createRecipe(Recipe recipe){
//      return  recipeService.createARecipe(recipe);
//    }
}
