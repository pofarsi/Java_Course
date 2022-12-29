package lecture05.section05.Polymorphism;

// Why And When To Use "Inheritance" and "Polymorphism"?
// It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String disambiguation() {
        return "no disambiguation";
    }
}

class toyStory extends Movie {
    public toyStory() {
        super("toyStory");
    }

    @Override
    public String disambiguation() {
        return "+6";
    }
}

class PiratesOfTheCaribbean extends Movie {
    public PiratesOfTheCaribbean() {
        super("Pirates Of The Caribbean");
    }

    @Override
    public String disambiguation() {
        return "PG-13";
    }
}

class Friends extends Movie {
    public Friends() {
        super("Friends");

    }

    @Override
    public String disambiguation() {
        return "16";
    }

}

class ModernFamily extends Movie {
    public ModernFamily() {
        super("ModernFamily");

    }

    @Override
    public String disambiguation() {
        return "E";
    }
}

class UnknownMovie extends Movie {
    public UnknownMovie() {
        super("UnknownMovie");
    }
    // No method, Polymorphism.
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie number " + i + " is--> " + movie.getName()
            + " disambiguation--> " + movie.disambiguation());
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new toyStory();

            case 2:
                return new PiratesOfTheCaribbean();

            case 3:
                return new Friends();

            case 4:
                return new ModernFamily();

            case 5:
                return new UnknownMovie();

            default:
                return null;

        }
        // return null;
    }
}

