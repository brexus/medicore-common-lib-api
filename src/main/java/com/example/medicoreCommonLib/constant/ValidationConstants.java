package com.example.medicoreCommonLib.constant;


public final class ValidationConstants {

    private ValidationConstants() {}

    // --- COMMON ---
    public static final int STATUS_MAX_LENGTH = 20;
    public static final int ACCESS_CODE_MAX_LENGTH = 4;

    // --- PATIENT & DOCTOR ---
    public static final int FIRST_NAME_MAX_LENGTH = 50;
    public static final int LAST_NAME_MAX_LENGTH = 50;
    public static final int PESEL_LENGTH = 11;
    public static final int EMAIL_MAX_LENGTH = 100;
    public static final int PHONE_NUMBER_MAX_LENGTH = 20;
    public static final int GENDER_MAX_LENGTH = 20;

    public static final int LICENSE_NUMBER_MAX_LENGTH = 7;
    public static final int SPECIALIZATION_MAX_LENGTH = 100;

    // --- ADDRESS ---
    public static final int STREET_MAX_LENGTH = 100;
    public static final int BUILDING_NUMBER_MAX_LENGTH = 10;
    public static final int APARTMENT_NUMBER_MAX_LENGTH = 10;
    public static final int CITY_MAX_LENGTH = 100;
    public static final int ZIP_CODE_LENGTH = 12;
    public static final int COUNTRY_MAX_LENGTH = 50;

    // --- PRESCRIPTION ---
    public static final int MEDICATION_NAME_MAX_LENGTH = 150;
    public static final int DOSAGE_MAX_LENGTH = 255;

    // ---  LAB ORDER ---
    public static final int TEST_NAME_MAX_LENGTH = 255;
    public static final int RESULT_PDF_URL_MAX_LENGTH = 255;


    // REGEX

    public static final String FIRST_NAME_REGEX = "^[A-Za-zĄąĆćĘęŁłŃńÓóŚśŻżŹź]+(?:[\\s\\-'][A-Za-zĄąĆćĘęŁłŃńÓóŚśŻżŹź]+)*$";
    public static final String LAST_NAME_REGEX = "^[A-Za-zĄąĆćĘęŁłŃńÓóŚśŻżŹź]+(?:[\\s\\-'][A-Za-zĄąĆćĘęŁłŃńÓóŚśŻżŹź]+)*$";
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    public static final String PHONE_NUMBER_REGEX = "^\\+?[0-9]{9,15}$";
    public static final String LICENSE_NUMBER_REGEX = "^[0-9]{7}$";

    public static final String STREET_REGEX = "^[A-Za-zĄąĆćĘęŁłŃńÓóŚśŻżŹź0-9\\s\\-.]+$";
    public static final String CITY_REGEX = "^[A-Za-ząĄćĆęĘłŁńŃóÓśŚżŻźŹ\\s\\-' ]+$";
    public static final String ZIP_CODE_REGEX = "^\\d{2}-\\d{3}$";
    public static final String BUILDING_NUMBER_REGEX = "^[0-9]+[A-Za-z0-9/\\-]{0,5}$";
    public static final String APARTMENT_NUMBER_REGEX = "^[0-9]{0,5}$";
    public static final String COUNTRY_REGEX = "^[A-Za-ząĄćĆęĘłŁńŃóÓśŚżŻźŹ\\s\\-']+$";
}