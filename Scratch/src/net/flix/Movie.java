package net.flix;

class Movie {
    // fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;


    // constructors

//    public Movie(){
//      // no operation
//    }

    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre){
        //delegate to setters for any validation/conversion they might be doing
        this(title, genre);                  // delegate to ctor above for title, genre
        setReleaseYear(releaseYear);         // delegate to its setter for any validation/conversion
        setRevenue(revenue);                 // ditto
        setRating(rating);                   //
        // setGenre(genre);                  //
    }

    // business methods - pause(), play(), stop(), rewind(), fastForward()

    // accessor (get/set) methods - these provide "controlled access" to the object's fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
          return String.format("Movie: Title = %s; Release Year = %s; Revenue = %,.0f; Rating = %s; Genre = %s",
                  getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

//        return "Movie: title = " + getTitle() + ", Release Year = " + getReleaseYear() +
//                ", Revenue = " + getRevenue() + ", Rating = " + getRating() + ", Genre = " + getGenre();
    }
}