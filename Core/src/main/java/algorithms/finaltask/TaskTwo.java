package algorithms.finaltask;

import java.util.Stack;

// Дан односвязный список целых чисел.
// Преобразовать его таким образом, чтобы все отрицательные числа были в конце списка
public class TaskTwo {
    public static void main(String[] args) {
        NodeList list = new NodeList();
        list.add(9);
        list.add(-1);
        list.add(12);
        list.add(7);
        list.add(-6);
        list.add(3);

        list.print(); // выводим список

        list.sortList(list);
        list.print(); // выводим отсортированный список
    }
}

class Node {
    int val;
    Node next;
}

class NodeList {
    private Node head; // первая нода в списке
    private int size = 0; // размер списка

    public void add(int val) {
        Node newElement = new Node(); // создаем новую ноду, она является последней ("хвостом")
        newElement.val = val; // добавляем ей значение

        if (head == null) { // если первая нода пустая
            head = newElement; // то делаем новую ноду первой и увеличиваем размер списка
            size++;
            return;
        }
        Node current = head; // текущая нода является первой
        while (current.next != null) { // пока следуюшая нода не пустая, т.е. список не кончился
            current = current.next; // делаем следующую ноду текущей
            size++; // увеличиваем размер
        }
        current.next = newElement;
    }

    public void print() {
        Node current = head; // текущая нода является первой
        while (current != null) { // пока список не пуст
            System.out.println(current.val + " | "); // печатем значение текущей ноды
            current = current.next; // идем в следующую ноду
        }
        System.out.println();
    }

    public void sortList(NodeList list) {
        Stack stack = new Stack();

        Node current = list.head; // текущая нода является первой
        Node temp = null;

        while (current != null) {
            temp = current; // записали текущий элемент в буфер
            current = current.next; // сдвинулись дальше
            if (current.val < 0) {
                stack.push(current.val); // если текущий меньше нуля, сохраняем его значение в стек
                temp.next = current.next; // перебросили ссылку с текущего на предыдущий
                current = temp; // сделали сохраненный элемент текущим
            } else {
                current = current.next; // если значение больше нуля - идем дальше
            }
        }

        while (!stack.isEmpty()) {
            Object popValue = stack.pop();
            String elementInString = popValue.toString();
            int integerValue = Integer.parseInt(elementInString);
            list.add(integerValue);
        }
    }
}
