package net.flix;

enum Genre {
    ROMANCE("Romance"),
    ACTION("Action"),
    HORROR("Horror"),
    COMEDY("Comedy"),
    DOCUMENTARY("Documentary"),
    THRILLER("Thriller"),
    DRAMA("Drama"),
    SCI_FI("Sci-Fi");

    // Everything below here is regular class definition stuff, i.e. fields, ctors, methods
    private final String display;

    // constructor - implicitly private, only called from inside (8 times above)
    Genre(String display) {
        System.out.println("Genre ctor called");
        this.display = display;

    }

    // accessor methods - here, we provide "read-only" access to the display property
    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();    //generally better to call you own getter
    }
}