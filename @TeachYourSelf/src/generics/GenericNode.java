/**
 * Prof. Philipp Jenke
 * Hochschule für Angewandte Wissenschaften (HAW), Hamburg
 * Lecture demo program.
 */

package generics;

/**
 * Representation of a generic node with arbitrary content in a binary tree with
 * two children
 * 
 * @author Philipp Jenke
 * 
 */
public class GenericNode<T> {
    /**
     * Content of the node.
     */
    private T element;

    /**
     * Left child.
     */
    private GenericNode<T> left;

    /**
     * Right child
     */
    private GenericNode<T> right;

    /**
     * Default constructor.
     * 
     * @param content
     *            Initial value for the content.
     * @param left
     *            Left child.
     * @param right
     *            Right child.
     */
    public GenericNode(T element, GenericNode<T> left, GenericNode<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    /**
     * Getter.
     */
    public GenericNode<T> getLeft() {
        return left;
    }

    /**
     * Getter.
     */
    public GenericNode<T> getRight() {
        return right;
    }

    /**
     * Getter
     * 
     * @return Content.
     */
    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        return element.toString();
    }

    /**
     * Program starting point.
     */
    public static void main(String[] args) {
        GenericNode<Integer> integerNode = new GenericNode<Integer>(1, null,
                null);
        GenericNode<String> stringNode = new GenericNode<String>("Eins", null,
                null);
        System.out.println(integerNode);
        System.out.println(stringNode);

        Number number = null;
        new GenericNode<Number>(number, null, null);
    }

}
