import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pqH = new PriorityQueue<>(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                pq.add(num);
            } else if (num < 0) {
                pqH.add(num);
            } else{
                if (pq.size() > 0 && pqH.size() > 0) {
                    if (pq.peek() - Math.abs(pqH.peek()) < 0) {
                        sb.append(pq.poll());
                    } else {
                        sb.append(pqH.poll());
                    }
                } else if (pq.size() > 0) {
                    sb.append(pq.poll());
                } else if (pqH.size() > 0) {
                    sb.append(pqH.poll());
                } else {
                    sb.append(0);
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}