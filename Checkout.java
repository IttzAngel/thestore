package store;

public class Checkout {

    public static void main(String[] args) {

        Cloth cloth = new Cloth("Shirt", 50.0);
        Employee employee = new Employee(10);

        System.out.println("This " + cloth.description + " cost $" + cloth.price + ". As an employee with a 10% discount, your new total is: $" + Employee.discount);




    }
}
