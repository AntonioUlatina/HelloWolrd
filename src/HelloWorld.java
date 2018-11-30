
public class HelloWorld {

<<<<<<< HEAD
	public String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void whatsMyName() {
		System.out.println("My name is what? My name is what? My name is " + name);
=======
	public void hi() {
		System.out.println("Hello World ngrok");
>>>>>>> 8d439034834aaf19836cd4c733d82da9d3ac682f
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		HelloWorld hw = new HelloWorld();
		hw.setName("Antonio");
		hw.whatsMyName();

	}

}
