import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String tag = "";

        for (int i = 0; i < str.length(); i++) {
            String c = String.valueOf(str.charAt(i));

            if (c.equals("<")) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                tag = "<";
            } else if (c.equals(">")) {
                sb.append(tag + ">");
                tag = "";
            } else if (tag.length() <= 0) {
                if (c.equals(" ")) {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else {
                    stack.add(c);
                }
            } else {
                tag += c;
            }

        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}