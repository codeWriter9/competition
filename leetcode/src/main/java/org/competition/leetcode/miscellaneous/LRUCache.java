package org.competition.leetcode.miscellaneous;

import java.util.HashMap;
import java.util.Map;

class ListNode {
    int key;
    int val;
    ListNode next;
    ListNode prev;

    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    int capacity;
    Map<Integer, ListNode> dic;
    ListNode head;
    ListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        dic = new HashMap<>();
        head = new ListNode(-1, -1);// sentinel
        tail = new ListNode(-1, -1);// sentinel
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!dic.containsKey(key)) { // if we do not have the key
            return -1;// return -1
        }

        ListNode node = dic.get(key);// get the node
        remove(node);// remove the node from its place
        add(node);// add the node to the end
        return node.val;// return the value
    }

    public void put(int key, int value) {
        if (dic.containsKey(key)) { // if key already exists
            ListNode oldNode = dic.get(key); // get the key
            remove(oldNode);// remove the key
        }

        ListNode node = new ListNode(key, value);// create a new node
        dic.put(key, node);// put in dic
        add(node);// add at end

        if (dic.size() > capacity) { // if size is greater than capacity
            ListNode nodeToDelete = head.next;// delete first node
            remove(nodeToDelete);
            dic.remove(nodeToDelete.key);// delete key
        }
    }

    public void add(ListNode node) {
        ListNode previousEnd = tail.prev;// add the node to the end
        previousEnd.next = node;// point the previous end to the node
        node.prev = previousEnd;// point the node to the previous end
        node.next = tail;
        tail.prev = node;
    }

    public void remove(ListNode node) {
        node.prev.next = node.next;// point the previous node to the next node
        node.next.prev = node.prev;// point the next node to the previous node
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */