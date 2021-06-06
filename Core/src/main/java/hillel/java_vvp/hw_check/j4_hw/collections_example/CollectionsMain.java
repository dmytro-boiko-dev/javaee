package hillel.java_vvp.hw_check.j4_hw.collections_example;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {

        // List --> ArrayList

//        Music hipHop = new Music();
//        hipHop.genre = "rap";
//        hipHop.groupsCount = 1248;
//        hipHop.isPopular = true;
//
//        Music rock = new Music();
//        rock.genre = "Black Metal";
//        rock.groupsCount = 666;
//        rock.isPopular = false;
//
//        Music classic = new Music();
//        classic.genre = "classic";
//        classic.groupsCount = 367;
//        classic.isPopular = true;
//
//
        ArrayList<Music> musicGenres = new ArrayList<>();
//
//        musicGenres.add(hipHop);
//        musicGenres.add(rock);
//        musicGenres.add(classic);
//
//
////        for (Music music : musicGenres){
////            music.print();
////        }
//
//        // Set --> HashSet
//
        Set<String> usernames = new TreeSet<>();
//
//        usernames.add("user1");
//        usernames.add("user2");
//        usernames.add("user3");
//        usernames.add("user48");
//        usernames.add("user0");
//
//        for(String element : usernames){
//            System.out.println(element);
//        }
//
//        System.out.println("-----------------------");
////        usernames.clear();
//
        ArrayList<String> anotherUsers = new ArrayList<>();
//
//        anotherUsers.add("userA");
//        anotherUsers.add("userB");
//        anotherUsers.add("userC");
//
//        for(String element : usernames){
//            System.out.println(element);
//        }
//        System.out.println("-----------------------");
//
//        usernames.addAll( anotherUsers );
//
//        for(String element : usernames){
//            System.out.println(element);
//        }

        // Map --> HashMap

        /*          ,------------------not unique
            key : value
             ^---------------- unique

         */

        Map<String, Music> events = new TreeMap<>();

        events.put("01.07.2017", new Music());
        events.put("02.12.1976", new Music());
        events.put("15.01.2004", new Music());
        events.put("15.01.2021", new Music());

        for (Map.Entry<String, Music> entry: events.entrySet()){

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
