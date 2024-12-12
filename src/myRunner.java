import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class myRunner {
    public static void main(String[] args) {
        //Glab ArrayList Example 1
        //Creating an ArrayList of String
        List<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);
        //Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        System.out.println(animals);
        System.out.println();


        //Glab ArrayList Example 2
        //Create ArrayList from Collection Example
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        //Creating an ArrayList from another Collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        //Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);
        System.out.println();


        //Glab Example 3
        //Accessing elements from an ArrayList

        List<String> topCompanies = new ArrayList<>();
        //Check if ArrayList is empty
        System.out.println("Is the topCompanies list empty? " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        //Find size of Arraylist
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world!");
        System.out.println(topCompanies);

        //Retrieve element at given index
        String bestCompany = topCompanies.get(0);
        System.out.println("Best company: " + bestCompany);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);
        System.out.println("Last company in the list: " + lastCompany);

        //Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
        System.out.println();

        //GLAB Example 4 Removing elements from an ArrayList

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial list: " + programmingLanguages);

        //Remove the element at index 5
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);

        //Remove the first occureence of a given element from an ArrayList
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove \"Kotlin\": " + programmingLanguages);

        //Remove all elements that exist in an ArrayList
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        //Remove all elements from ArrayList
        //programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
        System.out.println();

        //GLAB Example 5 : Iterating over an ArrayList
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison Break");
        System.out.println("----Iterate using an iterator()---");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while( tvShowIterator.hasNext() ) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("----Iterate using Iterator() and forEachRemaining()---");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println("----Iterate using simple forEach()---");
        for (String tvShow : tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
        System.out.println("\n=== Iterate iterator ===");
        ListIterator iterator = tvShows.listIterator();
        System.out.println("Elements in forward direction");

        System.out.println("\n====== Iterate using while loop=======");

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("=========Elements in backward direction======");

        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
        System.out.println();

        //GLAB Example 6 Searching for elements in an ArrayList
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));



    }

}