class Triangle{
	
	static void type(int a,int b,int c){
		if( ((a+b)>c) & ((b+c)>a) & ((a+c)>b) ){
			if( (a==b) && (b==c) ){
				System.out.println("Equilateral triangle");
			}
			else if( (a==b) | (b==c) | (a==c) ){
				System.out.println("Isosceles triangle");
			}
			else{
				System.out.println("Scalene triangle");
			}
		}
		else{
			System.out.println("Given triangle is not possible");
		}
	
	}
	public static void main(String args[]){
		type(10,10,30);	
		type(20,20,20);
		type(20,10,20);
		type(2,3,4);
	}
}