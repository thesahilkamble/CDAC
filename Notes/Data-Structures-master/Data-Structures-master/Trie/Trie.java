/**
 * @author Gaurav Rajput - grv0908@gmail.com
 * 
 * Util class for Trie
 */
class Trie {
    private TrieNode root;
    private int totalNodes;

    Trie() {
        this.root = new TrieNode('/');
        this.totalNodes = 0;
    }

    public void insert(String word) {
        insert(root, word);
    }

    private void insert(TrieNode currentNode, String word) {
        if(word.length() == 0) {
            currentNode.count++;
            return;
        }

        char c = word.charAt(0);
        if(!currentNode.children.containsKey(c)) {
            TrieNode newNode = new TrieNode(c);
            this.totalNodes++;
            currentNode.children.put(c, newNode);
        }

        insert(currentNode.children.get(c), word.substring(1));
    }

    public boolean containsWord(String word) {
        return containsWord(root, word);
    }

    private boolean containsWord(TrieNode currentNode, String word) {
        if(word.length() == 0) {
            if(currentNode.count > 0)
                return true;
            return false;
        }
        char c = word.charAt(0);
        if(!currentNode.children.containsKey(c))
            return false;
        return containsWord(currentNode.children.get(c), word.substring(1));
    }

    public void remove(String word) throws ElementNotFoundException {
        remove(root, word);
    }

    private boolean remove(TrieNode currentNode, String word) throws ElementNotFoundException {
        if(word.length() == 0) {
            if(currentNode.count == 1 && currentNode.children.size() == 0) {
                currentNode.count--;
                return true;
            }
            else if(currentNode.count >= 1) {
                currentNode.count--;
                return false;
            }
            else
                throw new ElementNotFoundException();
        }

        char c = word.charAt(0);
        if(!currentNode.children.containsKey(c))
            throw new ElementNotFoundException();
        
        boolean res = remove(currentNode.children.get(c), word.substring(1));
        if(!res) {
            return false;
        }
        currentNode.children.remove(c);
        this.totalNodes--;
        if(currentNode.children.size() == 0 && currentNode.count == 0) {
            return true;
        }
        return false; 
    }

    public int getTotalNodes() {
        return this.totalNodes;
    }
}