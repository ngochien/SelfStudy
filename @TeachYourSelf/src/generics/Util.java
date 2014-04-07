/**
 * Prof. Philipp Jenke
 * Hochschule für Angewandte Wissenschaften (HAW), Hamburg
 * Lecture demo program.
 */
package generics;

/**
 * Utility class which provides helper methods for the generic classes.
 * 
 * @author Philipp Jenke
 * 
 */
public class Util {
	/**
	 * Count the number of nodes in the tree.
	 * 
	 * @param node
	 *            Root node of the tree.
	 * @return Number of nodes in the tree
	 */
	int countNodes(GenericNode<?> node) {
		int result = 0;
		if (node != null) {
			result = 1 + countNodes(node.getLeft())
					+ countNodes(node.getRight());
		}
		return result;
	}

	/**
	 * Alternative implementation of countNodes with a generic method.
	 * 
	 * @param <T>
	 * 
	 * @param node
	 * @return
	 */
	public <T> int countNodes2(GenericNode<T> node) {
		int ergebnis = 0;
		if (node != null) {
			ergebnis = 1 + countNodes2(node.getLeft())
					+ countNodes2(node.getRight());
		}
		return ergebnis;
	}

	/**
	 * This method returns the second argument if the first one is null.
	 * 
	 * @param data
	 *            first argument
	 * @param backup
	 *            second argument
	 */
	public <T> T ifNull(T data, T backup) {
		T result = data;
		if (data == null) {
			result = backup;
		}
		return result;
	}

	public void test() {
//		String str = ifNull(null, "Hallo");
//		String str = ifNull(this.<String>ifNull(null, null), null);
//		String str= ifNull(null, null);
//		String s = ifNull(ifNull(null, null), null);
	}
}
