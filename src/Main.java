import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double gals;
        double fuelEff;
        double pricePerGal;
        double costPerMile;
        double distance;

        //checks gallons
        do {
            System.out.println("Enter current number of Gallons of Gasoline in Vehicle:");
            if(scan.hasNextDouble()){
                gals = scan.nextDouble();
                if(gals >= 0){
                    break;
                }
            }
                System.out.println("You have entered an invalid value for gallons of gas. Please try again.");
                scan.nextLine();
        } while (true);

        //checks fuel eff
        do {
            System.out.println("enter fuel Efficiency in MPG");
            if(scan.hasNextDouble()){
                fuelEff = scan.nextDouble();
                if(fuelEff > 0){
                    break;
                }
            }
            System.out.println("You have entered an invalid value for fuel Efficiency in MPG. Please try again.");
            scan.nextLine();
        } while (true);

        //checks gallon of gas
        do {
            System.out.println("Enter current price for Gallon of Gas");
            if (scan.hasNextDouble()) {
                pricePerGal = scan.nextDouble();
                if(pricePerGal > 0 ){
                    break;
                }
            }
            System.out.println("You have entered an invalid value for price of gallon of gas. Please try again.");
            scan.nextLine();
        } while (true);

        // math/output
        costPerMile = (100/fuelEff) * pricePerGal;
        distance = gals*fuelEff;

        System.out.printf("%-15s %7.2f","Cost per 100 Mile in $:", costPerMile);
        System.out.printf("\n%-15s %7.2f","Distance Left in Miles:", distance);

    }
}