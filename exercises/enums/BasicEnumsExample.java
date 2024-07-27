package exercises.enums;


public class BasicEnumsExample {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("%s is %.2f AU from the Sun%n", planet.getName(), planet.getDistanceFromSun());
//            System.out.println("Name of planet: " + planet.getName() + "\n" + "Planet's distance from the Sun: "
//                    + planet.getDistanceFromSun());
        }
    }
}
