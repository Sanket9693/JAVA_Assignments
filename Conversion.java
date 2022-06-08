class Conversion{
	static void bin(int dec){
		int a[]=new int[10];
		int r=0;
		while(dec>0){
			a[r]=dec%2;
			dec=dec/2;
			r++;
		}
		for(int i=r-1;i>=0;i--){
			System.out.print(a[i]);
		}
	}
	
	static void oct(int oct){
		bin(10);
	}
	
}

class ConversiontoOct{
	static void bin(int dec){
		int a[]=new int[10];
		int r=0;
		while(dec>0){
			a[r]=dec%8;
			dec=dec/8;
			r++;
		}
		for(int i=r-1;i>=0;i--){
			System.out.print(a[i]);
		}
	}
	
	static void oct(int oct){
		bin(76);
	}
	
}
