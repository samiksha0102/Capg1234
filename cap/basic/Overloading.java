package com.cap.basic;

public class Overloading {
static void add() {
System.out.println("default method");

}
static void add(int a,int b) {
System.out.println((a+b));

}static void add(int a,float b) {
System.out.println((a+b));

}static void add(float a,float b) {
System.out.println((a+b));

}static void add(float a,int b) {
System.out.println((a+b));

} public static void main(String args[]){
Overloading.add();
Overloading.add(11,24);
Overloading.add(11,24.23f);
Overloading.add(34.21f,12.23f);
Overloading.add(23.4f,11);
Overloading.add('a','b');


}
}