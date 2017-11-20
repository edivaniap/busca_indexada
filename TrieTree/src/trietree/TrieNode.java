package trietree;

import java.util.ArrayList;

/**
 * @author Edivânia Pontes de Oliveira
 * @date   19 de Novembro de 2016
 */

public class TrieNode {
    /* Campos do TrieNode */
    public ArrayList<TrieNode> children;
    public char character;
    public boolean word;
    //public int occurrences;
    
    /**
     * Construtor padrão
     */
    public TrieNode() {
        children = new ArrayList<TrieNode>();
    }
    
    /**
     * Construtor parametrizado
     * 
     * @param c 
     */
    public TrieNode(char c) {
        character = c;
        children = new ArrayList<TrieNode>();
    }
    
    /**
     * Busca binária
     * Se o elemento for encontrado, retorna o indice, caso contrário retorna -1
     * 
     * @param c
     * @return indice ou -1;
     */
    
    public int binarySearch(char c) {
        return -1;
    }
}
