package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// using iterator from java 8 feature and foreach method
public class Array4 {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad season 1");
        tvShows.add("Game Of Thrones");
        tvShows.add("Hello");
        tvShows.add("Prison Ok");
       /* tvShows.forEach(tvShow->{
            System.out.println(tvShows);
        });*/
        /*System.out.println("=== Iterate using Java 8 forEach and lambda ===");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
        });*/
        tvShows.forEach(String -> {
            System.out.println(String);
        });
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }
    }
}