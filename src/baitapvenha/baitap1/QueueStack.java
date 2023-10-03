package baitapvenha.baitap1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    public static void main(String[] args) {
        // Tạo một danh sách đầu vào (có thể là danh sách các phần tử bất kỳ)
        LinkedList<String> inputList = new LinkedList<>();
        inputList.add("Phần tử 1");
        inputList.add("Phần tử 2");
        inputList.add("Phần tử 3");
        inputList.add("Phần tử 4");
        inputList.add("Phần tử 5");
        System.out.println("phần tử trong input list: "+inputList);
        // Tạo một Queue và thêm các phần tử từ danh sách đầu vào vào Queue
        Queue<String> queue = new LinkedList<>(inputList);
        System.out.println("các phân tử trong queue: "+queue);
        // In ra các phần tử của Queue
        System.out.println("Các phần tử trong Queue:");
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }
    }
}
