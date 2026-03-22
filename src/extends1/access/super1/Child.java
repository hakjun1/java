package extends1.access.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this 생략가능
        System.out.println("super value = " + super.value);

        this.hello();//생략가능
        super.hello();
    }
}
