package com.example.carSale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CarSaleApplication {

	public static void main(String[] args) {

		/*SpringApplication.run(CarSaleApplication.class, args);*/

//		Car carForFamily = new Car(configurable);
//		System.out.println(carForFamily.readyForSale());
//		Car carForYoung = new Car(configurable);
//		System.out.println(carForYoung.readyForSale());

	/*	Car carForFamily = new Car(new SedanConfiguration());
		System.out.println(carForFamily.readyForSale());


		Car carForYoung = new Car(new SportConfiguration());
		System.out.println(carForYoung.readyForSale());

		Car carForMan = new Car(new JeepConfiguration());
		System.out.println(carForMan.readyForSale());

		Car carForWoman = new Car(new HatchbackConfiguration());
		System.out.println(carForWoman.readyForSale());*/


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car carForFamily = context.getBean("sedanCar",Car.class);
		System.out.println(carForFamily.readyForSale());

		Car carForYoung = context.getBean("sportCar",Car.class);
		System.out.println(carForYoung.readyForSale());

		Car carForMan = context.getBean("jeepCar",Car.class);
		System.out.println(carForMan.readyForSale());

		Car carForWoman = context.getBean("hatchbackCar",Car.class);
		System.out.println(carForWoman.readyForSale());
	}

}
