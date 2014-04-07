/**
 * Prof. Philipp Jenke
 * Hochschule für Angewandte Wissenschaften (HAW), Hamburg
 * Lecture demo program.
 */
package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Philipp Jenke
 * 
 */
public class Knoten<T> {

    /**
     * Element at the node.
     */
    private T element;

    /**
     * Container for the children
     */
    private List<Knoten<T>> kinder;

    /**
     * Constructor
     * */
    Knoten(T neuesElement) {
        element = neuesElement;
        // To Do
        kinder = new LinkedList<Knoten<T>>();
    }

    /**
     * Getter
     */
    public T getElement() {
        return element;
    }

    /**
     * Setter
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Getter.
     */
    public List<Knoten<T>> getKinder() {
        return kinder;
    }

    /**
     * Knoten als Kind hinzufügen.
     * 
     * @param kind
     */
    public void kindHinzufuegen(Knoten<T> kind) {
        kinder.add(kind);
    }

}
