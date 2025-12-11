import java.util.*;

// ***************** Single Inheritance ***************************//
// class A{
// void run(){
// System.out.println("Hi Class: A");
// }
// }
// class B extends A{
// void run(){ //overriding run() in the class A
// System.out.println("Hi Class: B");
// }
// }
// ****************** Hierarchical inheritance ************************//
// class A{
// void run(){
// System.out.println("Hi Class: A");
// }
// }
// class B extends A{
// void run(){
// System.out.println("Hi Class: B");
// }
// }
// class C extends A{
// void run(){
// System.out.println("Hi Class: C");
// }
// }
// ****************** Multiple inheritance **************************//
// class A{
// void run(){
// System.out.println("Hi Class: A");
// }
// }
// class B extends A{
// void run(){
// System.out.println("Hi Class: B");
// }
// }
// class C extends B{
// void run(int a){ // parametrised method overloading
// System.out.println("Hi Class: C");
// }
// }
// ********************* Interface (Multiple Inheritance)
// **************************//
// interface A{ // It doesnt contain the body in latest java it has default can
// create body
// void run(); // interface must be abstract class
// }
// interface B{
// void walk();
// }
// class C implements A,B{ // If implements perfoms it should override the
// parrent class methods
// public void run(){
// System.out.println("Hi Class: C runs");
// }
// public void walk(){
// System.out.println("Hi Class: C walks");
// }
// }
// ***************** Abstract class ********************/
// only one inheritance
// high speed
// have some body methods
// *******/
// abstract class A{
// abstract void run();
// void swim(){
// System.out.println("A is swimming");
// }
// }
// class C extends A{
// void run(){
// System.out.println("Hi This is Abstract");
// }
// }
// ************************ Custom Exception handeling
// ********************************//
// class notvalid extends Exception {
// public notvalid(String a) {
// super(a);
// }
// }

// ************************ Exception handeling ****************************//
// class A {
// void exc(int a) throws Exception {
// int j = 24 / a;
// }
// }

// public class Interview {
// public static void main(String[] args) {
// try {// InputMismatchExceptiton, ArithmeticException
// // int i = 44 / 2; // if it is not 0 in divadent but,you need to throw an
// error
// // then throw is used
// // throw new ArithmeticException("hello");
// // if(i<24){
// // throw new notvalid("Invalid i");
// // }
// A a = new A();
// a.exc(0);
// } catch (Exception e) {
// System.out.println(e);
// }
// // catch (notvalid e) {
// // System.out.println(e);
// // }
// finally { // you need to print the msg wheather there is an error or not
// "finally is used"
// System.out.println("Finally printed");
// }
// }
// }
/******************* Normal class ***************************/
// public class Interview {
// public static void main(String[] args) {
// C c = new C();
// c.run();
// // c.swim();
// // c.walk();
// }
// }
// ****************** Threads ********************//

// public class Interview {
// public static void main(String[] args) {

// }
// }
