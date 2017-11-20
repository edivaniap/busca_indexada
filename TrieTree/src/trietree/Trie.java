package trietree;

/**
 * @author Edivânia Pontes de Oliveira
 * @date   19 de Novembro de 2016
 */

public class Trie {
    /* Nó raiz */
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String s) {
        for(int i = 0; i < s.length(); i++) {
            TrieNode node;
            char c = s.charAt(i);
            
            int index = root.binarySearch(c);
            
            if(index == -1) { //caso nao contenha o character nos filhos
                node = new TrieNode(c);
                root.children.add(node);
            } else {
                node = root.children.get(index);
            }
           
            if (i == s.length() - 1)
                node.word = true;
        }
    }
    
    public void print() {
        System.out.println("Trie Tree:");
        for(int i = 0; i < root.children.size(); i++) {
            System.out.println(i + " - " + root.children.get(i).character);
        }
        
    }
}
