package com.company.spring.service;

import java.util.List;

import com.company.spring.entity.IngredientsEntity;
import com.company.spring.entity.ReceipeEntity;
import com.company.spring.model.Ingredients;
import com.company.spring.model.Receipe;



public interface ReciepeService {
	public List<ReceipeEntity> getAllReciepies();

	public List<IngredientsEntity> getAllIngredients();

	public ReceipeEntity saveReciepe(Receipe receipe);

	public List<ReceipeEntity> getReciepeByIngredients(Ingredients ingredient);
}
