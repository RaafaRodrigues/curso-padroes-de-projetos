package com.rafael.curso.builder.solution.one;

import com.rafael.curso.builder.solution.one.builder.FastFoodMealBuilder;
import com.rafael.curso.builder.solution.one.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burgerCombo = new FastFoodMealBuilder("Fries")
				.andMain("CheeseBurger")
				.forDrink("Code")
				.thatsAll();
		System.out.println(burgerCombo);

		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
		System.out.println(justFries);

		FastFoodMeal heartAttackCombo = new FastFoodMealBuilder("Large Fries")
				.andMain("Monster Burguer")
				.forDrink("Milk Shake")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.thatsAll();
		System.out.println(heartAttackCombo);
	}
}