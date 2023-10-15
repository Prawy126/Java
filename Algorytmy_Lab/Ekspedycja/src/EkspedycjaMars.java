import java.util.*;

public class EkspedycjaMars {

    public static void main(String[] args) {
        // Dziedziny specjalistyczne kosmonautów
        Map<String, List<String>> specjalistyczneDziedziny = new HashMap<>();
        specjalistyczneDziedziny.put("A", Arrays.asList("k1", "k4"));
        specjalistyczneDziedziny.put("B", Arrays.asList("k2", "k3", "k4"));
        specjalistyczneDziedziny.put("C", Arrays.asList("k3", "k5"));
        specjalistyczneDziedziny.put("D", Arrays.asList("k1", "k2", "k5"));

        // Znalezienie jak najmniejszej grupki kosmonautów
        Set<String> wybraniKosmonauci = znajdzNajmniejszaGrupke(specjalistyczneDziedziny);

        System.out.println("Wybrani kosmonauci: " + wybraniKosmonauci);
    }

    public static Set<String> znajdzNajmniejszaGrupke(Map<String, List<String>> dziedziny) {
        // Wszyscy dostępni kosmonauci
        Set<String> wszyscyKosmonauci = new HashSet<>();
        for (List<String> kosmonauci : dziedziny.values()) {
            wszyscyKosmonauci.addAll(kosmonauci);
        }

        // Szukanie kombinacji, która spełnia warunki
        for (int i = 1; i <= wszyscyKosmonauci.size(); i++) {
            for (Set<String> kombinacja : kombinacje(wszyscyKosmonauci, i)) {
                if (spełniaWarunki(kombinacja, dziedziny)) {
                    return kombinacja;
                }
            }
        }

        return null; // nie powinno się zdarzyć, ale dodajemy dla pełności
    }

    public static boolean spełniaWarunki(Set<String> kombinacja, Map<String, List<String>> dziedziny) {
        for (List<String> kosmonauci : dziedziny.values()) {
            if (Collections.disjoint(kombinacja, kosmonauci)) {
                return false;
            }
        }
        return true;
    }

    // Funkcja do generowania kombinacji
    public static <T> Set<Set<T>> kombinacje(Set<T> set, int rozmiar) {
        Set<Set<T>> kombinacje = new HashSet<>();
        if (rozmiar == 0) {
            kombinacje.add(new HashSet<>());
            return kombinacje;
        }
        for (T element : set) {
            Set<T> tempSet = new HashSet<>(set);
            tempSet.remove(element);
            for (Set<T> podzbiory : kombinacje(tempSet, rozmiar - 1)) {
                podzbiory.add(element);
                kombinacje.add(podzbiory);
            }
        }
        return kombinacje;
    }
}
