package Dao;


import java.util.List;

import Models.Food;


public interface FoodDao {
	
	public void addFood(Food food);
	public List<Food> showFood(Food food);
	public List<Food> findFood(Food food);
}
