
public class Boxing {


public static void main(String[] args) {
	int a=10;//primitive data type
	//boxing
	Integer a1=new Integer(a);
	Integer.valueOf(a);
	System.out.println(a1);
	//autoboxing}

Integer a2=a;
System.out.println(a2);
Integer b=new Integer(34);
//unboxing
int c=b.intValue();
System.out.println(c);
//autounboxing
int d = b;
System.out.println(d);
}
}
