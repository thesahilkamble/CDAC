package com.grv.HashMap;


import java.util.ArrayList;

public class MapNode<K, V> {
	
	K key;
	V value;
	MapNode<K,V> next;
	
	MapNode(K key, V value){
		this.key = key;
		this.value = value;
	}
}



public class Map <K, V> {
	
	ArrayList<MapNode<K,V>> buckets;
	int size;
	
	Map(){
		buckets = new ArrayList<>();
		size = 0;
		for(int i = 0; i<10; i++)
			buckets.add(null);
	}
	
	public void put(K key, V value) {
		int hashCode = getHashCode(key);
		int index = compress(hashCode);
		
		MapNode<K,V> head = buckets.get(index);
		while(head!=null) {
			if(head.key.equals(key)) {
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
		
		if(size * (1.0) / buckets.size() > .7 )
			rehash();
		
	}
	
	public V get(K key) throws ElementNotFoundException {
		int hashCode = getHashCode(key);
		int index = compress(hashCode);
		
		MapNode<K, V> head = buckets.get(index);
		while(head!= null) {
			if(head.key.equals(key))
				return head.value;
			head = head.next;
		}
		
		throw new ElementNotFoundException();
		
	}
	
	public void remove(K key) throws ElementNotFoundException {
		int hashCode = getHashCode(key);
		int index = compress(hashCode);
		
		MapNode<K,V> head = buckets.get(index);
		if(head.key.equals(key)) {
			buckets.set(index, head.next);
			head.next = null;
			size--;
			return;
		}
		
		while(head.next!= null) {
			if(head.next.key.equals(key))
			{
				size--;
				head.next = head.next.next;
			}
			head = head.next;
		}
		
		throw new ElementNotFoundException();	
	}
	
	
	public void rehash() {
		ArrayList<MapNode<K,V>> temp = buckets;
		buckets = new ArrayList<>();
		int newSize = temp.size() * 2;
		
		for(int i = 0; i<newSize; i++) {
			buckets.add(null);
		}
		
		for(MapNode<K,V> currentNode : temp) {
			while(currentNode != null) {
				put(currentNode.key, currentNode.value);
				currentNode = currentNode.next;
			}
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public ArrayList<K> getKeys(){
		ArrayList<K> keys = new ArrayList<>();
		for(MapNode<K,V> currentMapNode : buckets) {
			while(currentMapNode!=null) {
				keys.add(currentMapNode.key);
				currentMapNode = currentMapNode.next;
			}
		}
		return keys;
	}
	
	public int size() {
		return size;
	}
	
	public int getHashCode(K key) {
		return key.hashCode();
	}
	
	public int compress(int hashCode) {
		return hashCode%buckets.size();
	}
}

public class ElementNotFoundException extends Exception {
}


