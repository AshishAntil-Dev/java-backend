package Daily_learning_one_thing;

/*In Java, classes can have different access modifiers
 that determine their visibility (where they can be accessed from). The most common are public and default (package-private).

1. Public Class

A public class is accessible from anywhere (from any package or file in your project).

The file name must match the public class name.

You can have only one public class in a .java file.


2. Private Class

Top-level classes cannot be private.
(Java does not allow a .java file to have a private top-level class.)

Private classes are allowed only as inner/nested classes inside another class.

A private nested class is accessible only within the outer class.
 */
public class day1_2sept_class {
    private class spt{

    }
}

//If you don’t specify any modifier, the class is package-private, meaning it’s accessible only within the same package
class bank{
    void help() {
        System.out.println("This is a default (package-private) class.");
    }
}
