import java.util.*;
class Arraysort{
	public static void main(String[] args){
		int a[]={2,4,5,6,7,9};
		char c[]={'b','g','d','a','e','c'};
		double d[]={2.1,2.5,2.3,2.6,2.8,2.9};
		Arrays.sort(a);
		Arrays.sort(c);
		Arrays.sort(d);
		int i;
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

		for(i=0;i<c.length;i++){
			System.out.println(c[i]);

		}

		for(i=0;i<d.length;i++){
			System.out.println(d[i]);

		}

	}
}