import java.util.*;
/**
 * @author Gaurav Rajput - grv0908@gmail.com
 */

 /**
  * Representing a node structure of a Trie
  */
class TrieNode {
    char  c;
    HashMap<Character, TrieNode> children;
    int count;  // represents number of words end at this node

    TrieNode(char c) {
        this.c = c;
        children = new HashMap<>();
        this.count = 0;
    }
}