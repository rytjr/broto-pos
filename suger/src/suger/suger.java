package suger;
import java.util.*;


/* 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 
 * 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 
 * 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오. */

/* 처음 작성한 코드
 * 5로 최대한 나눈 후 남은 값에 3을 몇개 넣어야 최소일징 중점을 두고 고민했던 코드입다.
 * 
 * if(num < 5) {
	if(num == 3) {
		System.out.print(1);
	}
	else {
		System.out.print(-1);
	}
}
else if(sum == 0) {
	System.out.print(count);
}
else if(sum ==1 || sum == 3) {
	System.out.print(count + 1);
}
else if(sum == 4 ) {
	System.out.print(count + 2);
}
else if(sum == 2) {
	if(num%2 == 0) {
		System.out.print(count +2);
	}
	else System.out.print(-1);
}
else {
	System.out.print(-1);
} 
결국 답에 도달할 수 없었다. */

public class suger {
	public static void main(String[] args) {
		
		
		/* 가장 작은 봉지를 가져가기 위해서는 5에 중심을 두어야 할 것 같지만 사실은 3이 가장 중요하다.
		 * 처음에는 5에 중점을 두어 코들르 작성하였지만 문제를 해결하기 위해서는 다음과 같은 방식이 적절하다.
		 * 주어진 정수에서 계속 3을 빼주면서 5로 나누었을 때 나머지가 없는지 확인한다. 
		 * 핵심은 가장 작은 봉지를 가져가는 것이고 가장작은 봉지를 가져가기 위해서는 5를 최대한 많이 챙겨야 한다 그러기 때문에 3을 계속 뺴주어
		 * 5로 나누어지는 것을 찾으면 되는 것이다. 
		 * 문제를 읽고 문제를 정확하게 해결하는 연습이 많이 필요할 것 같다. */
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = num;
		int count = 0;
		
		if(num%5 == 0) {
			System.out.print(num/5);
		}
		else {
			for(int i = 0; i < num; i++) {
				++count;
				sum -=3;
				if(sum%5 == 0) {
					System.out.print(sum/5+count);
					break;
				}
				if(count*3 == num) {
					System.out.print(count);
					break;
				}
				if(count*3 > num) {
					System.out.print(-1);
					break;
				}
			}
		}
	}

}
