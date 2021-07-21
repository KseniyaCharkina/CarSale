package com.example.carSale;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class CarSaleApplicationTests {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

	@Test
	void contextLoads() {
		Car carForFamilyTest = context.getBean("sedanCar",Car.class);
		String resultOne = carForFamilyTest.readyForSale();
		Assert.isTrue(resultOne.equals("Car ready in Sedan"));

		Car carForYoung = context.getBean("sportCar",Car.class);
		String resultTwo = carForYoung.readyForSale();
		Assert.isTrue(resultTwo.equals("Car ready in Sport"));

		Car carForMan = context.getBean("jeepCar",Car.class);
		String resultThree = carForMan.readyForSale();
		Assert.isTrue(resultThree.equals("Car ready in Jeep"));


		Car carForWoman = context.getBean("hatchbackCar",Car.class);
		String resultFour = carForWoman.readyForSale();
		Assert.isTrue(resultFour.equals("Car ready in Hatchback"));

	}

}
