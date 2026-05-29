/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 * @author Francesc Perez
 * @version 1.1.0
 */
public class DataValidation {

    public static boolean isNumber(char c) {
        return (48 <= c && c <= 57);
    }

    public static boolean isLetter(char c) {
        //The name can contain uppercase and lowercase letters, whitespace, 
        //hyphens and code control
//        return (97 <= c && c <= 122) || (65 <= c && c <= 90) || (c == 32) || (c == 45);
        return Character.isLetter(c) || c == 32 || c == 45;
    }

    public static String calculateNifLetter(String nifNoLetter) {
        String[] letter = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
            "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        return nifNoLetter + letter[Integer.parseInt(nifNoLetter) % 23];
    }

    public static boolean isValidEmail(String email) {

        if (email == null || email.trim().isEmpty()) {
            return false;
        }

        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        return email.trim().matches(emailRegex);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            return false;
        }

        String phoneRegex = "^\\+?[0-9]{1,4}?[-.\\s]?(\\d{1,3})?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}$";

        return phoneNumber.trim().matches(phoneRegex);
    }

    public static boolean isValidPostalCode(String postalCode) {

    if (postalCode == null || postalCode.trim().isEmpty()) {
        return false;
    }

    String postalCodeRegex = "^(\\d{5})(?:[-\\s]?\\d{4})?$";

    return postalCode.trim().matches(postalCodeRegex);
}
    
}
