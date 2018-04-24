package org.bootcamp;


public class MainApp {

    public static void main(String[] args) {

        final Car joesCar = new Car(5, 200000, true, "auto");
        final Bus stevesBus = new Bus(3, 100000, true, 31);
        final Tipper petersTipper = new Tipper(6, 80000, false, 15);

        //final InsurancePolicyCalculate calculate = InsurancePolicyCalculate.INSTANCE;
        /*
        final int joesInsurancePolicyCost = calculate.calculate(joesCar);
        final int stevesInsurancePolicyCost = calculate.calculate(stevesBus);
        final int petersInsurancePolicyCost = calculate.calculate(petersTipper);

        //joesInsurancePolicyCost += joesCar.isDiesel() ? 500 : 0;
        /*if(joesCar.isDiesel()){
            joesInsurancePolicyCost +=500;
        }*/
        final InsurancePolicyCalculate calculate = InsurancePolicyCalculate.INSTANCE;

        final Formula CarBasicFormula = new CarBasicFormula();
        final Formula BusBasicFormula = new BusBasicFormula();
        final Formula TipperBasicFormula = new TipperBasicFormula();

        final int joesInsurancePolicyCost = calculate.calculate(joesCar, CarBasicFormula);
        final int stevesInsurancePolicyCost = calculate.calculate(stevesBus, BusBasicFormula);
        final int petersInsurancePolicyCost = calculate.calculate(petersTipper, TipperBasicFormula);

        System.out.println("Joe's policy cost is " + joesInsurancePolicyCost);
        System.out.println("Steve's policy cost is " + stevesInsurancePolicyCost);
        System.out.println("Peter's policy cost is " + petersInsurancePolicyCost);
    }
}