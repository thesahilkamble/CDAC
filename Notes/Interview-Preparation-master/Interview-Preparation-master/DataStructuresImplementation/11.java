package com.grv.trie;

import java.util.HashMap;

public class Trie {

	private class TrieNode {
		char c;
		HashMap<Character, TrieNode> children;
		boolean isWord;

		public TrieNode(char c) {
			this.c = c;
			children = new HashMap<>();
			isWord = false;
		}
	}

	private final TrieNode root;

	public Trie() {
		root = new TrieNode('/');
	}

	public boolean insert(String word) {
		return insert(root, word);
	}

	private boolean insert(TrieNode currentNode, String word) {

		if (word.length() == 0) {
			if (currentNode.isWord) {
				return false;
			}
			currentNode.isWord = true;
			return true;
		}

		char c = word.charAt(0);

		if (!currentNode.children.containsKey(c)) {
			TrieNode newNode = new TrieNode(c);
			currentNode.children.put(c, newNode);
		}

		return insert(currentNode.children.get(c), word.substring(1));
	}

	public boolean containsWord(String word) {
		return containsWord(root, word);
	}

	private boolean containsWord(TrieNode root, String word) {

		if (word.length() == 0) {
			if (root.isWord)
				return true;
			return false;
		}

		char c = word.charAt(0);

		if (root.children.containsKey(c)) {
			return containsWord(root.children.get(c), word.substring(1));
		}
		return false;
	}

	public boolean removeWord(String word) {
		return removeWord(root, word);
	}

	private boolean removeWord(TrieNode root, String word) {
		if (word.length() == 0) {
			if (root.isWord) {
				root.isWord = false;
				return true;
			}

			return false;
		}

		char nextChar = word.charAt(0);
		if (!root.children.containsKey(nextChar)) {
			return false;
		}
		TrieNode nextNode = root.children.get(nextChar);
		boolean smallResult = removeWord(nextNode, word.substring(1));
		if (!smallResult) {
			return false;
		}
		if (nextNode.children.size() == 0 && !nextNode.isWord) {
			root.children.remove(nextChar);
		}
		return true;
	}
}
