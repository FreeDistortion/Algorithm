import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int su=sc.nextInt();
		char[] arr=sc.next().toCharArray();
		int sum=0;
		int length=arr.length;
		for(int i=0;i<length;i++) {
			sum+=arr[i]-'0';
		}
		System.out.println(sum);
	}

}
