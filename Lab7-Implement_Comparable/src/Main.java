public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie("My Movie",1);
        Movie movie2 = new Movie("MyOtherMovie",4);

        String thisMovieString = myMovie.toString();

        System.out.println(myMovie.compareTo(movie2));

    }




}