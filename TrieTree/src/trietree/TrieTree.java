
package trietree;

/**
 *
 * @author proae
 */
public class TrieTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trie tree = new Trie();
        
        tree.insert("ola");
        tree.insert("peixe");
        tree.print();
    }
    
}
