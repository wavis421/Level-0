class MyClass {

	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();
	}

	private MyClass() {
		// private
		System.out.println("this is private MyClass");
	}

	public static MyClass newInstance() {
		System.out.println("this is public MyClass");
		return new MyClass();
	}
}
