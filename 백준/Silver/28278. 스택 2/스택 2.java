import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		Stack<Integer> s = new Stack<Integer>();
		StringTokenizer st;

		int cc = Integer.parseInt(br.readLine());

		for (int i = 0; i < cc; i++) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			switch (Integer.parseInt(a)) {
			case 1:
				s.add(Integer.parseInt(st.nextToken()));
				break;
			case 2:
				if (!s.empty()) {
					sb.append(s.pop());

				} else {
					sb.append(-1);
				}
				sb.append("\n");
				break;
			case 3:
				sb.append(s.size());
				sb.append("\n");
				break;
			case 4:
				if (s.empty()) {
					sb.append(1);
				} else {
					sb.append(0);
				}
				sb.append("\n");
				break;
			case 5:
				if (!s.empty()) {
					sb.append(s.peek());
				} else {
					sb.append(-1);
				}
				sb.append("\n");
				break;
			}
		}
		br.close();
		System.out.println(sb);
	}
}