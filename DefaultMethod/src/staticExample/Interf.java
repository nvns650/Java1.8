package staticExample;

public interface Interf {
static void m1() { 	System.out.println("in-static");}
default void m2() {System.out.println("in-default"); }
}
