package dac;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ValidateFields {
    
  
    public static LocalDate validateDog(String str) {
        try {
            LocalDate dog = LocalDate.parse(str);
            LocalDate today = LocalDate.now();
            return today.isAfter(dog) ? dog : null;
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format for dog. Please use YYYY-MM-DD.");
            return null;
        }
    }

    
    public static LocalDate validateDob(String str) {
        try {
            LocalDate dob = LocalDate.parse(str);
            LocalDate today = LocalDate.now();
            LocalDate adultDate = today.minusYears(21);
            return dob.isBefore(adultDate) ? dob : null;
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format for DOB. Please use YYYY-MM-DD.");
            return null;
        }
    }

   
    public static boolean validatePhoneNo(String no) {
        return no != null && no.matches("\\d{10}");
    }

    
    public static boolean validateAadhaarNo(String adhar) {
        return adhar != null && adhar.matches("\\d{12}");
    }

   
    public static Degree validateDegree(String t) {
        try {
            return Degree.valueOf(t);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid degree: " + t);
            return null;
        }
    }
}
