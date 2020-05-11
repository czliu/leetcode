// 1114. print in order
// #easy #concurrent 
// *

package _1114;

class Foo {
    private volatile int mark = 1;
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        mark = 2;
        synchronized (this){
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        while (mark != 2) {
            synchronized (this){
                wait();
            }
        }
        mark=3;
        printSecond.run();
        synchronized (this){
            notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        while (mark != 3) {
            synchronized (this){
                wait();
            }
        }
        printThird.run();
    }

}
