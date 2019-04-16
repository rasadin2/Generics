package Generic;

public class CustomList <T,U>{
	
	private Object array1[]= new Object[0];
	private Object array2[]=new Object[0];
	
	int size=0;
	
	void add(T a, U b) {
		
		if(size>=array1.length-1 && size>=array2.length-1) {
			
			Object temp1[]=array1.clone();
			array1=new Object[array1.length+1];
			System.arraycopy(temp1, 0, array1, 0, temp1.length);
			
			Object temp2[]=array2.clone();
			array2=new Object[array2.length+1];
			System.arraycopy(temp2, 0, array2, 0, temp2.length);
			
			
		}
		
		array1[size]=a;
		array2[size]=b;
		size++;
			
	}
	
	void delete(int a) {
		if(size<1) {
			System.out.println("Nothing to delete");
		}else {
		
		for(int i=a;i<=array1.length-2;i++) {
			
			array1[i]=array1[i+1];
			array2[i]=array2[i+1];
		}
		
		size--;
		
		Object temp3[]=array1.clone();
		array1=new Object[array1.length-1];
		System.arraycopy(temp3, 0, array1, 0, temp3.length-1);
		
		Object temp4[]=array2.clone();
		array2=new Object[array2.length-1];
		System.arraycopy(temp4, 0, array2, 0, temp4.length-1);
		}
		
		
		
	}
	
	void print() {
		for(int i=0;i<array1.length;i++) {
			
			System.out.println("Index: "+i);
		    System.out.println(array1[i]);
		    System.out.println(array2[i]);
		}
	}
	
	void update(String a,int b, String c , int d) {
		
		int count=0;
		
		for(int i=0;i<array1.length;i++) {
			
			if(array1[i]==a && array2[i].equals(b)) {
				array1[i]=c;
				array2[i]=d;
				count++;
			}
		}
		
		if(count==0) {
			
			System.out.println("There is no such Record");
		}
		
		
	}
	
	void search(String a, int b) {
		int count=0;
		for(int i=0;i<array1.length;i++) {
			
			if(array1[i]==a && array2[i].equals(b)) {
				
				System.out.println(array1[i]+"\n"+array2[i]);
				count++;
			}
		}
			if(count==0) {
			
			System.out.println("Not Found");
		}
	}
	
	void addAll(CustomList <String,Integer> a) {
		
		int length1=a.array1.length+this.array1.length;
		int length2=this.array1.length;
		Object temp1[]=this.array1.clone();
		this.array1=new Object[length1];
		System.arraycopy(temp1, 0, this.array1, 0, temp1.length);
		System.arraycopy( a.array1,0, this.array1, length2, a.array1.length);
//		for(int i=length2;i<a.array1.length;i++) {
//			
//			this.array1[i]=a.array1[i];
//		}
		
		Object temp2[]=this.array2.clone();
		this.array2=new Object[length1];
		System.arraycopy(temp2, 0, this.array2, 0, temp1.length);
		System.arraycopy( a.array2,0, this.array2, length2, a.array2.length);
//		for(int i=length2;i<a.array2.length;i++) {
//			
//			this.array2[i]=a.array2[i];
//		}
		
		
	}
	
	public static void main(String [] args) {

		CustomList<String,Integer> a1 = new CustomList<String,Integer>();
		CustomList<String,Integer> a2 = new CustomList<String,Integer>();
		
		a1.add("Kafi",123);
		a1.add("Miraj",456);
		a1.add("Rohim", 789);
		a1.add("Korim",741);
		a1.add("Mahbub",852);
		a1.add("Sefuda",963);
		System.out.println();
		System.out.println("After Delete");
		a1.delete(2);
		a1.print();
		System.out.println();
		System.out.println("After Update");
		a1.update("Sefuda", 963, "Sefatulla", 420);
		a1.print();
		//a1.search("kodu",000);
		System.out.println();
		System.out.println("After Add");
		a2.add("Kashem", 654);
		a2.print();
		System.out.println();
		System.out.println("After Add All");
		a2.addAll(a1);
		a2.print();
		
		
	}
}
