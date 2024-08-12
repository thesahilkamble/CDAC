import java.util.ArrayList;

/**
 * @author Gaurav Rajput - grv0908@gmail.com
 */
class HashMap<K, V> {
    private float lf = 0.7f;
    private int size;
    private ArrayList<MapNode<K, V>> buckets;

    HashMap(){
        this.buckets = new ArrayList<>();
        this.size = 0;
        for(int i = 0; i < 10; i++)
            buckets.add(null);
    }

    public void put(K key, V value) {
        int hashCode = this.getHashCode(key);
        int index = compress(hashCode);

        MapNode<K,V> head = buckets.get(index);
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(index);
        MapNode<K,V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        buckets.set(index, newNode);
        size++;

        if(size * (1.0) / buckets.size() > this.lf)
            rehash();
    }

    public void rehash() { 
        ArrayList<MapNode<K,V>> temp = buckets;
        buckets = new ArrayList<>();
        int newSize = temp.size() * 2;

        for(int i = 0; i<newSize ; i++) {
            buckets.add(null);
        }

        for(MapNode<K, V> currNode : temp) {
            while(currNode != null) {
                this.put(currNode.key, currNode.value);
                currNode = currNode.next;         
            }
        }
    }

    public V get(K key) throws ElementNotFoundException {
        int hashCode = this.getHashCode(key);
        int index = compress(hashCode);

        MapNode<K,V> head = buckets.get(index);
        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        throw new ElementNotFoundException();
    }

    public void remove(K key) throws ElementNotFoundException {
        int hashCode = this.getHashCode(key);
        int index = compress(hashCode);

        MapNode<K, V> head = buckets.get(index);

        if(head.key.equals(key)){
            buckets.set(index, head.next);
            head.next = null;
            this.size--;
            return;
        }
        while(head.next != null){
            if(head.next.key.equals(key)){
                MapNode<K, V> temp = head.next;
                head.next = temp.next;
                temp.next = null;
                this.size--;
                return;
            }
            head = head.next;
        }
        throw new ElementNotFoundException();
    }

    public boolean containsKey(K key) {
        int hashCode = this.getHashCode(key);
        int index = compress(hashCode);

        MapNode<K, V> head = buckets.get(index);
        while(head != null){
            if(head.key.equals(key)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    private int getHashCode(K key) {
        return key.hashCode();
    }

    private int compress(int hashCode) {
        return hashCode % buckets.size();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0 ? true : false;
    }
}