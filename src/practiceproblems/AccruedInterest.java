/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


/**
 *
 * @author Jagadheesan Balu
 */
public class AccruedInterest {
    private static final int MIN_ACCEPTABLE_YEAR = 1900;
    private static final int MAX_ACCEPTABLE_YEAR = 2100;
    static final DecimalFormat df6 = new DecimalFormat("#.######");
    private static final TimeZone UTC_TIMEZONE = TimeZone.getTimeZone("Etc/UTC");
    public static void main(String[] args) throws ParseException {
        
         
        
//        BigDecimal accruedBD = new BigDecimal("-71.06", MathContext.DECIMAL128);
//        BigDecimal qtyBD = new BigDecimal("298868.58", MathContext.DECIMAL128);
//        BigDecimal interest = accruedBD.divide(qtyBD, 6, RoundingMode.HALF_UP);
//        String res = df6.format(interest);
//        System.out.println(res);
//        
//        BigDecimal bd = new BigDecimal(res);
//        
//         int i = bd.compareTo(BigDecimal.ZERO);
//         System.out.println(i);
        
        
//        BigDecimal convertGBX = new BigDecimal("100");
//        BigDecimal bd = new BigDecimal(NumberUtils.isNumber("2.2*9".trim().replaceAll(
//            ",", "")) ? "2.2*9".trim().replaceAll(",", "") : "0",
//            MathContext.DECIMAL128).setScale(6).multiply(convertGBX);
        
//        int bd = new BigDecimal(NumberUtils.isNumber("22*4.5".trim().replaceAll(
//                ",", "")) ? "22*4.5".trim().replaceAll(",", "") : "2",
//                MathContext.DECIMAL128).setScale(6).compareTo(BigDecimal.ZERO);
//        
//        System.out.println(bd);
        
        String REVERSE_DATE_FORMAT = "yyyyMMdd";
        DateFormat reverseDateFormat = new SimpleDateFormat(REVERSE_DATE_FORMAT);
        DateFormat shortDateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        shortDateFormat.setTimeZone(UTC_TIMEZONE);
        Date date = parse("23/3/2018", shortDateFormat);
        System.out.println("date "+date);
        System.out.println(format(date, reverseDateFormat));
          
    }
    
    private static String format(Date valueDate, DateFormat dateFormat) {

        String valueString;

        try {
            valueString = dateFormat.format(valueDate);
        } catch (Exception e) {
            System.out.println(e);
            valueString = "";
        }

        return valueString;

    }
    private static Date parse(String valueString, DateFormat dateFormat) {

        dateFormat.setLenient(false);

        Date valueDate;
        try {

            valueDate = dateFormat.parse(valueString);
            System.out.println("value "+valueDate);
            Calendar cal = Calendar.getInstance();
            cal.setTime(valueDate);
            if (cal.get(Calendar.YEAR) < MIN_ACCEPTABLE_YEAR || cal.get(Calendar.YEAR) > MAX_ACCEPTABLE_YEAR) {
                valueDate = null;
            }

        } catch (Exception e) {
            valueDate = null;
        }

        return valueDate;
    }
}
