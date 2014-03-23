package Operations.jni;

public class Interface {
	 public native void sayHello();
	 public native void suma(int arg, int arg2);
	 public native void mul(int arg, int arg2);
	 public native void div(int arg, int arg2);
	 public native void rest(int arg, int arg2);
	 public native void mod(int arg, int arg2);
	 static {
	  System.loadLibrary("OperationsLibrary");	  
	 }
	 public Interface (){System.out.println("world");}


}
	