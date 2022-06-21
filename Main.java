public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            int age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            System.out.println("Hello, I am " + firstName + lastName + "and I am " + age + "years old");
                system.out.println( age % 2 == 0);
                    boolean sameName = firstName = lastName;
                    System.out.println(sameName);
                        boolean amIOld = age > 0;
                        System.out.println(amIOld);
        }
        

        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"

        // Print out whether age is even

        // Print out whether firstName equals lastName

        // Print out whether age is greater than 0

    }
}
