import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;


class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty())
            return false;
        if (myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection))
            return false;
        return true;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        return collections.stream()
                .reduce((set1, set2) -> {
                    Set<String> intersection = new HashSet<>(set1);
                    intersection.retainAll(set2);
                    return intersection;
                }).orElse(new HashSet<>());
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        for (Set<String> collection : collections) {
            all.addAll(collection);
        } 
        return all;
    }
}
