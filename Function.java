class Generic{
	public static<e>void print(e[] args){
	for(e x: args){
	System.out.println(x);
	}
}}
	class Function{
		public static void main(String[] args){

Generic gn=new Generic();
			Integer a[]={1,2,3,4,5,6};
			Character c[]={'a','b','c','d','e'};
			Double d[]={1.2,3.0,4.5,6.6,9.8};
			gn.print(a);
			gn.print(c);
			gn.print(d);
		
	}
	}
