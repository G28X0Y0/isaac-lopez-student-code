package com.techelevator;

public class Exercise03_ShippingTotal {

    /*
    Scamper Shipping Company specializes in small, local deliveries.
    The problems below ask you to implement the logic to calculate a shipping amount for a package.
     */

    // You can use these constants in your solutions.
    private final int MAX_WEIGHT_POUNDS = 40;
    private final double UP_TO_40_LB_RATE = 0.50;
    private final double OVER_40_LB_RATE = 0.75;

    /*
    Scamper Shipping Company charges $0.50 per pound up to 40 pounds. After that, it's $0.75 for each additional pound.
    Implement the logic needed to calculate the shipping rate when provided a weight in pounds.

    Examples:
    calculateShippingTotal(10) ➔ 5.0
    calculateShippingTotal(25) ➔ 12.5
    calculateShippingTotal(45) ➔ 23.75
     */
    public double calculateShippingTotal(int weightPounds) {
        double totalCost1 = 0;
        if(weightPounds > MAX_WEIGHT_POUNDS) {
            totalCost1 = (MAX_WEIGHT_POUNDS * UP_TO_40_LB_RATE) + (weightPounds - MAX_WEIGHT_POUNDS) * OVER_40_LB_RATE;
        }
        else {
        totalCost1 = weightPounds * UP_TO_40_LB_RATE;
        }

        return totalCost1;
    }

    /*
    Scamper Shipping Company now allows customers to provide a discount code to give them 10% off of their order.
    Implement the logic to calculate the correct shipping rate when provided a weight in pounds and a boolean value for hasDiscount.

    Examples:
    calculateShippingTotal(10, false) ➔ 5.0
    calculateShippingTotal(10, true) ➔ 4.5
    calculateShippingTotal(25, false) ➔ 12.5
    calculateShippingTotal(25, true) ➔ 11.25
    calculateShippingTotal(45, false) ➔ 23.75
    calculateShippingTotal(45, true) ➔ 21.375
     */
    public double calculateShippingTotal(int weightPounds, boolean hasDiscount) {
        double totalCost1 = 0;
        if(weightPounds > MAX_WEIGHT_POUNDS) {
            totalCost1 = (MAX_WEIGHT_POUNDS * UP_TO_40_LB_RATE) + (weightPounds - MAX_WEIGHT_POUNDS) * OVER_40_LB_RATE;
        }
        else {
            totalCost1 = weightPounds * UP_TO_40_LB_RATE;
        }
        if(hasDiscount){
            totalCost1 -= totalCost1 * .1;
        }

        return totalCost1;
    }

    /*
    As the business grows for Scamper Shipping Company, they now offer discounts in various amounts.
    Implement the logic to calculate the shipping rate when provided a weight in pounds
    and a discount percentage (for example, 0.1 = 10% off).

    Examples:
    calculateShippingTotal(10, 0) ➔ 5.0
    calculateShippingTotal(10, 0.1) ➔ 4.5
    calculateShippingTotal(25, 0.15) ➔ 10.625
    calculateShippingTotal(45, 0.2) ➔ 19.0
     */
    public double calculateShippingTotal(int weightPounds, double discountPercentage) {
        double totalCost1 = 0;
        if(weightPounds > MAX_WEIGHT_POUNDS) {
            totalCost1 = (MAX_WEIGHT_POUNDS * UP_TO_40_LB_RATE) + (weightPounds - MAX_WEIGHT_POUNDS) * OVER_40_LB_RATE;
        }
        else {
            totalCost1 = weightPounds * UP_TO_40_LB_RATE;
        }
        if(discountPercentage > 0){
            totalCost1 -= totalCost1 * discountPercentage;
        }

        return totalCost1;
    }

    public static class Exercise02_CanDrive {

        /*
        The problems below ask you to implement the correct logic to answer
        whether someone is allowed to drive based on the provided parameters.
        NOTE: These rules are loosely based off of the real world
        and may be different from the state you live in.
         */

        /*
        A person can drive if they have a permit and are with a licensed passenger.
        Given two boolean values, hasPermit and withLicensedPassenger,
        write an expression that is true if a person can drive.

        Examples:
        canDrive(true, true) ➔ true
        canDrive(true, false) ➔ false
        canDrive(false, true) ➔ false
        canDrive(false, false) ➔ false
         */
        public boolean canDrive(boolean hasPermit, boolean withLicensedPassenger) {
            if (hasPermit && withLicensedPassenger) {
                return true;
            }
            return false;
        }

        /*
        In some states, the licensed passenger must be of a certain age.
        Implement the logic to return true if the person has a permit and is with a licensed passenger who is 21 or over.

        Examples:
        canDrive(true, true, 22) ➔ true
        canDrive(true, true, 19) ➔ false
        canDrive(false, true, 23) ➔ false
         */
        public boolean canDrive(boolean hasPermit, boolean withLicensedPassenger, int passengerAge) {
            if ((hasPermit && withLicensedPassenger) && passengerAge >= 21) {
                return true;
            }
            return false;
        }

        /*
        If the licensed passenger is the driver's legal guardian, they only have to be 18 instead of 21.
        Implement the logic to return true if the person has a permit and is with a licensed passenger.
        The licensed passenger only needs to be 18 or older if they're the driver's guardian. Otherwise, the passenger must be 21 or older.

        Examples:
        canDrive(true, true, 22, false) ➔ true
        canDrive(true, true, 19, true) ➔ true
        canDrive(false, true, 23, true) ➔ false
         */
        public boolean canDrive(boolean hasPermit, boolean withLicensedPassenger, int passengerAge, boolean isPassengerOurGuardian) {
            if ((hasPermit && withLicensedPassenger) && passengerAge >= 21) {
                return true;
            } else if ((hasPermit && withLicensedPassenger) && isPassengerOurGuardian && passengerAge >= 18) {
                return true;
            }
            return false;
        }
    }
}
