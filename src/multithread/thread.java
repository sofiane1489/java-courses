package multithread;
public class thread extends Thread{

        public static void main(String[] args) {

           thread thrad= new thread();
            thrad.start();
            System.out.println("this is not thread");
            int a=20;
            int b=26;
            int total=a+b;
            System.out.println(total);
   }

        public void run(){
            System.out.println("this the thread bb");
            int a=2;
            int b=26;
            int total=a+b;
            System.out.println(total);
        }

    }
