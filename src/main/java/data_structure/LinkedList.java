package data_structure;

public class LinkedList {

  private Node head;
  private Node tail;
  private int length;

  public LinkedList(String data) {
    Node newNode = new Node(data);
    this.head = newNode;
    this.tail = newNode;
    this.length = 1;
  }

  class Node {
    String data;
    Node next;

    Node (String data) {
      this.data = data;
    }
  }

  public String getTail() {
    return this.tail == null ? "Lista vazia!" : tail.data;
  }
  public String getHead() {
    return this.head == null ? "Lista vazia!" : head.data;
  }
  public int getLength() {
    return this.length;
  }
  public void makeEmpty() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }
  public void print() {
    System.out.println("------- Start of List -------");
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println("------- End of List -------");
  }
  public void append(String data) {
    Node newNode = new Node(data);
    if (this.length == 0) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.tail.next = newNode;
      this.tail = newNode;
    }
    this.length++;
  }
  public Node removeLast() {
    if (this.length == 0) return null;
    Node pre = head;
    Node temp = null;

    if (this.length > 1) {
      while (pre.next != this.tail) {
        pre = pre.next;
      }

      temp = tail;
      this.tail = pre;
      this.tail.next = null;
    } else {
      temp = head;
      this.head = null;
      this.tail = null;
    }
    this.length--;
    return temp;
  }

  public void prepend(String data) {
    Node newNode = new Node(data);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    length++;
  }

  public Node removeFist() {
    if (length == 0) return null;
    Node temp = head;
    head = head.next;
    temp.next = null;
    length--;
    if (length == 0) {
      head = null;
      tail = null;
    }
    return temp;
  }

  public Node get(int index) {
    if (index < 0 && index >= length) return null;
    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public boolean insert(int index, String data) {
    if (index < 0 && index > length) return false;
    if (index == 0) {
      prepend(data);
    } else if (index == length) {
      append(data);
    } else {
      Node newNode = new Node(data);
      Node priorNode = get(index - 1);
      newNode.next = priorNode.next;
      priorNode.next = newNode;
      length++;
    }
    return true;
  }
}
