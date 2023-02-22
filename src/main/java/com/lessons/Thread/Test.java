package com.lessons.Thread;

public class Test {

    public void RunThreadTest() {
        ThreadTest threadTest = new ThreadTest();
        threadTest.setName("线程一");
        threadTest.start();
        ThreadTest threadTest1 = new ThreadTest();
        threadTest1.setName("线程二");
        threadTest1.start();
    }

    public void RunableThreadTest() throws InterruptedException {
        Cat cat = new Cat();
        Thread catThread = new Thread(cat);
        catThread.start();

        Thread.sleep(1000);

        Dog dog = new Dog();
        Thread dogThread = new Thread(dog);
        dogThread.start();
    }
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
//        test.RunThreadTest();
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }

        test.RunableThreadTest();

    }
}
