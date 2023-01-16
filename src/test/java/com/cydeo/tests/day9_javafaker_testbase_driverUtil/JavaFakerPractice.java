package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void test1()
    {
        Faker faker=new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"###-###-##-##\") = " + faker.numerify("###-###-##-##"));

        System.out.println("faker.numerify(\"###-###-##-##\") = " + faker.numerify("312-###-40-##"));

        System.out.println("faker.letterify(\"??????\") = " + faker.letterify("??????"));

        System.out.println("faker.bothify(\"???###-###-??##?#\") = " + faker.bothify("???###-###-??##?#"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        //burada aradaki dash yani tireleri hiçbirşey ile değiştiriyoruz. böylece aradaki tireler gitmiş oluyor.
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-",""));

        System.out.println("faker.chuckNorris() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));


    }



}
