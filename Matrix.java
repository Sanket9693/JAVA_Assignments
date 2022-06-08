class Matrix{

	public static void main(String args[]){
			
			Matrix m1=new Matrix();
			m1.add();
			m1.sub();
			m1.mul();
			m1.revArray();
			m1.sortArray();
			m1.swapEvenIndex();
			
			
	}
	
	void add(){
			int c[][]=new int[10][10];
			
			int a[][]={ {1,2,3},{4,3,1},{7,8,9} };
			int b[][]={ {4,6,5},{7,8,9},{1,2,3} };
			
			System.out.println("Matrix Addition is: ");
			
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		
	}
	
	void sub(){
			int c[][]=new int[3][3];
			
			int a[][]={ {1,2,3},{4,3,1},{7,9,8} };
			int b[][]={ {4,6,5},{7,8,9},{9,2,3} };
			
			System.out.println("Matrix Subtraction is: ");
			
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					c[i][j]=a[i][j]-b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
	}
	
	void mul(){
					
			int c[][]=new int[10][10];
			
			int a[][]={{1,2,1},{3,2,0},{4,0,2}};    
			int b[][]={{3,4,2},{0,1,0},{2,0,1}};    
			
			//1(3)+2(0)+1(2)=5   1(4)+2(1)+1(0)=6   1(2)+2(0)+1(1)=3
			//3(3)+2(0)+0(2)=9   3(4)+2(1)+0(0)=14  3(2)+2(0)+0(1)=6
			//4(3)+0(0)+2(2)=16  4(4)+0(1)+2(0)=16  4(2)+0(0)+2(1)=10
			
			System.out.println("Matrix Multiplication is: ");
			
			for(int i=0;i<a.length;i++){		  
				for(int j=0;j<a[i].length;j++){  					 
					for(int k=0;k<a[j].length;k++){
						c[i][j]+= a[i][k]*b[k][j];
					}									
					System.out.print(c[i][j]+" ");		 
				}
				System.out.println();
			}  
	}
	
	void revArray(){
		int a[]={1,2,3,4,5};
		
		System.out.println("Reversed array is");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	void sortArray(){
		int a[]={2,5,4,3,1};
		
		System.out.println("Sorted array in ascending order is");
		
		for(int i=0;i<a.length;i++){
			int temp=0;
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Sorted array in descending order is");
		for(int i=0;i<a.length;i++){
			int temp=0;
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
	
	void swapEvenIndex(){
		int a[]={1,2,3,4,5};
		
		System.out.println("Swapping even index");
	}
		
}