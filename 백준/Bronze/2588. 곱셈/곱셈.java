import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		char[] b = bf.readLine().toCharArray();
		int l=b.length;
		int sum=0;
		for(int i=0;i<l;i++) {
			sb.append(a*(b[l-i-1]-'0'));
			sb.append("\n");
			sum+=a*(b[l-i-1]-'0')*Math.pow(10, i);
		}
		sb.append(sum);
		System.out.println(sb);
	}

}
