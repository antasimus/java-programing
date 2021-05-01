package OfficeHours.Homework;
/*
Create a class Movie
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        name, genre, duration, release date, rating(G, PG, R, etc..), is a sequels or not, rotten tomatoes rating (out of 100), is on dvd.

    - Print out the Movie information using concatenations and print statements

    ------ Welcome to the Cinema ------

    Tonight we are streaming "$movieName" which was released on $releaseDate
    This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
    The rating is $rating and it runs for $duration hours.
    This is a sequel $isSequel and is on dvd $isOnDvd.
 */
public class Movies {
    public static void main(String[] args) {
        String name="Star Gate", genre="SiFi", date="October 28th 1994";
        int rtr=94, durationHours=2, durationMin=12;
        double rating=7.2;
        boolean sequel=false, dvd=true;

        System.out.println("Tonight we are streaming \""+name+"\" which was released on "+date+".");
        System.out.println("This "+genre+" movie got a %"+rtr+" rating on Rotten Tomatoes.");
        System.out.println("The rating is "+rating+" and it runs for "+durationHours+" hours "+durationMin+" minutes.");
        System.out.println("This is a sequel("+sequel+") and is on DVD("+dvd+").");


    }
}
