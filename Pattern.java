class Pattern1{
	public static void main(String[] args){
	
		for (int i=1;i<=10;i++){
			
			for (int j=(10-i); j>=0; j--){ 
			
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				
				System.out.print("*");
							
			}
		System.out.println();
		}
	}
}


class Pattern2{
	public static void main(String args[]){
		for(int i=9;i>=0;i--){
			for(int j=(10-i);j>=0;j--){
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Pattern3{
	public static void main(String args[]){
		for (int i=1;i<=10;i++){
			
			for (int j=(10-i); j>=0; j--){ 
			
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				
				System.out.print("*");
							
			}
		System.out.println();
		}
		
		for(int i=9;i>=0;i--){
			for(int j=(10-i);j>=0;j--){
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}