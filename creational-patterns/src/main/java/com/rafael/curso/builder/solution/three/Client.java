package com.rafael.curso.builder.solution.three;


import com.rafael.curso.builder.solution.three.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries")
				.andMain("CheeseBurger")
				.forDrink("Code")
				.thatsAll();
		System.out.println(burguerCombo);
		
		FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").thatsAll();
		System.out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMeal.Builder("Large Fries")
				.andMain("Monster Burguer")
				.forDrink("Milk Shake")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.thatsAll();
		System.out.println(heartAtackCombo);
	}
}
