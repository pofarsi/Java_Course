package lecture01.section01;

public class Switch {
    public static void main(String[] args) {
//        We use switch when we're using if condition on one value.
        String gender = "Female";
//        if (gender.equals("Female")) {
//
//        } else if (gender.equals("Male")) {
//
//        } else if (gender.equals("Prefer not say")) {
//
//        } else {
//        }
        switch (gender) {
            case "Female":
                System.out.println("female");
                break;
            case "Male":
                System.out.println("male");
                break;
            case "Prefer not say":
                System.out.println("prefer not say");
                break;
            default:
        }
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
