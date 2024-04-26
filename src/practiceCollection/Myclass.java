package practiceCollection;

public class Myclass implements Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Myclass c=new Myclass();
	c.add(12, 12);
	c.add();
		c.name('c', 'b');
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int a, int b) {
		
		int c=a+b;
		
		System.out.println(c);
		
	}

	@Override
	public void name(char a, char b) {
		
	}

}
