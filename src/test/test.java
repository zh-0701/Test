package test;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		ArrayList l = new ArrayList<Integer>();
		l.add(-1);
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(-1);
		l.add(-4);
		l.sort(null);
		System.out.println(test1(l));
	}
	
	public static List<List<Integer>> test1(List<Integer> l) {
		List<List<Integer>> resultList = new ArrayList<>();
		int k1 = l.size()-1;
		for (int i = 0; i < l.size()-2; i++) {
			int first = l.get(i);
			int j = i+1;
			int k = k1;
			while (j != k) {
				if (l.get(j) + l.get(k) == -first) {
					System.out.println(l.get(j)+","+l.get(k)+","+l.get(j)  );
					List<Integer> result = new ArrayList<>();
					result.add(first);
					result.add(l.get(i) );
					result.add(l.get(j) );
					resultList.add(result);
					k--;
				}else {
					if (l.get(j) + l.get(k) > -first) {
						k--;
					} else {
						j++;
					}
				}
				}
				
			}
		return resultList;
	}
	
}
