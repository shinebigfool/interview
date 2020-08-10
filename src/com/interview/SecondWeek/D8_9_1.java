package com.interview.SecondWeek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class LRUCache{
    public int num;
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
    }
    private Node first;
    private Node last;
    private Map<Integer, Node> map;
    public int get(int key) {
        Node node = map.get(key);
        //为空返回-1
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.val;
    }
    public void put(int key, int value) {
        //先看看是否已经存在
        Node node = map.get(key);

        if (node == null) {
            //不存在创建节点，然后判断缓存是否满了，如果满了删除最后一个节点。然后将新节点放到链表头部，增加一个映射关系
            //存在则直接覆盖，然后移动到头部
            node = new Node();
            node.key = key;
            node.val = value;

            if(map.size() == num) {
                removeLast();
            }

            addToHead(node);
            map.put(key, node);
        } else {
            node.val = value;
            //moveToHead(node);
        }
    }
    private void moveToHead(Node node) {
        //要修改很多指针
        if (node == first) {
            return;
        } else if (node == last) {
            //如果是最后一个节点，将最后一个节点的next指针置为空，然后last指向前一个节点
            last.prev.next = null;
            last = last.prev;
        } else {
            //如果是中间节点，中间节点的前节点的后指针  指向 中间节点的后节点
            //中间节点的后节点的前指针 指向 中间节点的前节点
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        //把该节点作为头结点
        node.prev = first.prev;// 写成node.prev = null;更好理解
        node.next = first;
        first.prev = node;
        first = node;
    }
    private void addToHead(Node node) {
        if (map.isEmpty()) {
            first = node;
            last = node;
        } else {
            //把新节点作为头结点
            node.next = first;
            first.prev = node;
            first = node;
        }
    }
    private void removeLast() {
        map.remove(last.key);
        Node prevNode = last.prev;
        //修改last所指的位置
        if (prevNode != null) {
            prevNode.next = null;
            last = prevNode;
        }
    }
    public LRUCache(int num) {
        this.num = num;
        map = new HashMap<>(num);
    }
}
public class D8_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        LRUCache cache = new LRUCache(n);

        while (sc.hasNextLine()){
            String command = sc.nextLine().trim();
            if(n>0&&command.charAt(0)=='p'){
                int key = Integer.parseInt(command.substring(2, command.lastIndexOf(" ")));
                int value = Integer.parseInt(command.substring(command.lastIndexOf(" ")+1));
                cache.put(key,value);
            }else if(command.charAt(0)=='g'){
                int key = Integer.parseInt(command.substring(2));
                System.out.println(cache.get(key));
            }
        }
    }
}
