package com.how2java.springboot.test;

public class SingleLinkedList {
    private int size;//链表节点的个数
    private Node head;//头节点
    private Node temp;
    public SingleLinkedList() {
        size = 0;
        head = null;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    //在链表头添加元素（头插法）
    public Object addHead(Object obj) {
        Node newHead = new Node(obj);
        if (size == 0) {
            head = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
        return obj;
    }

    //在链表头添加元素（尾插法）
    public Object addEnd(Object obj) {
        Node newHead = new Node(obj);
        if (size == 0) {
            temp = newHead;
            head = temp;
        } else {
            temp.next = newHead;
            temp=newHead;
        }
        size++;
        return obj;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return (size == 0);
    }

    //显示节点信息
    public void display() {
        if (size > 0) {
            Node node = head;
            int tempSize = size;
            if (tempSize == 1) {//当前链表只有一个节点
                System.out.println("[" + node.data + "]");
                return;

            }
            while (tempSize > 0) {
                if (node.equals(head)) {
                    System.out.print("[" + node.data + "->");

                } else if (node.next == null) {
                    System.out.print(node.data + "]");

                } else {
                    System.out.print(node.data + "->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        } else {//如果链表一个节点都没有，直接打印[]
            System.out.println("[]");
        }
    }

    public void reversetList(Node head){
        if(head==null ||head.next == null){
             return  ;
        }
        Node cur = head.next;//需要反转的节点
        Node next= null ;//指向下一个需要反转的节点
        Node reverseList  = head;
        head.next =null;
        while(cur != null){
            next  =  cur.next;
            cur.next = reverseList;
            reverseList = cur;
            cur = next;
        }
        this.head = reverseList;

    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
/*        singleLinkedList.addHead("A");
        singleLinkedList.addHead("B");
        singleLinkedList.addHead("C");
        singleLinkedList.addHead("D");
        singleLinkedList.addHead("E");*/
        singleLinkedList.addEnd("A");
        singleLinkedList.addEnd("B");
        singleLinkedList.addEnd("C");
        singleLinkedList.addEnd("D");
        singleLinkedList.addEnd("E");
        System.out.println("开始：");
        singleLinkedList.display();
       singleLinkedList.reversetList(singleLinkedList.getHead());
        System.out.println("反转后：");
        System.out.println("size=="+singleLinkedList.getSize());
        singleLinkedList.display();
    }
}
