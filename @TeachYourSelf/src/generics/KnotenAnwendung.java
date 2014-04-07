/**
 * Prof. Philipp Jenke
 * Hochschule für Angewandte Wissenschaften (HAW), Hamburg
 * Lecture demo program.
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Philipp Jenke
 * 
 */
public class KnotenAnwendung {
    public static void main(String[] args) {
        Knoten<String> k23 = new Knoten<String>("23");
        Knoten<String> k42 = new Knoten<String>("42");
        Knoten<String> k12 = new Knoten<String>("12");
        k12.kindHinzufuegen(k23);
        k12.kindHinzufuegen(k42);
        Knoten<String> k7 = new Knoten<String>("7");
        Knoten<String> k2 = new Knoten<String>("2");
        k2.kindHinzufuegen(k7);
        k2.kindHinzufuegen(k12);
        traverse(k2);
        traverse(k12);
    }

    /**
     * Traverse all children an print them to console.
     */
    private static <T> void traverse(Knoten<T> startKnoten) {
        System.out.println("----");
        List<Knoten<T>> stack = new ArrayList<Knoten<T>>();
        stack.add(startKnoten);
        while (stack.size() > 0) {
            Knoten<T> knoten = stack.get(0);
            for (Knoten<T> kind : knoten.getKinder()) {
                stack.add(kind);
            }
            System.out.println(knoten.getElement());
            stack.remove(0);
        }
    }
}
