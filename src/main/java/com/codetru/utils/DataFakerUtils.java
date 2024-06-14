package com.codetru.utils;

import net.datafaker.Faker;

import java.util.Locale;

import com.codetru.constants.FrameworkConstants;

public class DataFakerUtils {
    //Java Locale List: https://www.viralpatel.net/java-locale-list-tutorial/
    private static Faker faker = new Faker(new Locale("en-US")); //Vietnam
//    private static Faker faker = null; //English US

    public static Faker getFaker() {
        if (faker == null) {
            faker = new Faker(new Locale(FrameworkConstants.LOCATE));
        }
        return faker;
    }

    public static void setFaker(Faker faker) {
        DataFakerUtils.faker = faker;
    }

    public static void setLocate(String LocateName) {
        faker = new Faker(new Locale(LocateName));
    }

}
