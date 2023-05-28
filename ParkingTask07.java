package week_04;
/*
Task 7: Parking [ternary, relational]

    create a program that will define a time variable.
    Use a 24 hour format. Based on the given time determine the cost of parking in the city

        If the time is between 6-12:
            fee: 7.50

        if the time is between 13 - 23 or 0 - 5
            fee is 15
 */
public class ParkingTask07 {
    public static void main(String[] args) {
        double time = 25;
        double fee = 00;

        if ((time >= 0) && (time <= 24)) {
            if (time >= 6 && time <= 12) {
                fee = 7.5;

            } else {
                fee = 15;
            }

        } else {
            System.out.println("İnvalid Value");
        }
        System.out.println("fee is : "+fee);

    }
}
