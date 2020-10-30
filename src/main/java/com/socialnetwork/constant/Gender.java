package com.socialnetwork.constant;

public enum Gender {
    MALE(1),
    FEMALE(2),
    UNKNOW(3);

    private final int gender;

    Gender(int sex) {
        gender = sex;
    }

    public static Gender getGenderById(Integer id) {
        if (id == null) {
            return UNKNOW;
        }

        switch (id) {
            case 1:
                return MALE;
            case 2:
                return FEMALE;
            default:
                return UNKNOW;
        }

    }

    public static int getGenderByName(String name) {
        if (name == null) {
            return UNKNOW.gender;
        }
        switch (name) {
            case "MALE":
                return MALE.gender;
            case "FEMALE":
                return FEMALE.gender;
            default:
                return UNKNOW.gender;
        }
    }
}






