package Module11;
import java.util.LinkedList;
import java.util.Queue;
public class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> printerQueue = new LinkedList<>();
        printerQueue.add("What is"+" ");
        printerQueue.add("your"+" ");
        printerQueue.add("Name?"+" ");
        //System.out.println("Print Queue: " + printerQueue);
        while (!printerQueue.isEmpty()) {
            String name = printerQueue.poll();
            System.out.println("Printing: " + name);
        }

        System.out.println("Secret");
    }
}

