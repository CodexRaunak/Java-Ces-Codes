class MyThreadByExtending extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThreadByExtending thread = new MyThreadByExtending();
        thread.start(); // Starts the thread
    }
}
