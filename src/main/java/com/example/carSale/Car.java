package com.example.carSale;

public class Car {
    /* private SportConfiguration configuration;
       private SedanConfiguration configuration;

         public String readyForSale(){
         configurable = new SedanConfiguration();
         configurable = new SportConfiguration();
         return "Car ready in " + sedanConfiguration.makeConfiguration();
     }*/

 /*     private Configurable configurable;

        public String readyForSale() {
        configurable = new SedanConfiguration();
        return "Car ready in " + configurable.makeConfiguration();
    }*/

    private Configurable configurable;


    public Car(Configurable configurable) {
        this.configurable = configurable;
    }

    public String readyForSale(){
        return "Car ready in " + configurable.makeConfiguration();
    }


}
