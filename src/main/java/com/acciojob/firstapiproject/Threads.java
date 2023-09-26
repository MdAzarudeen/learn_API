package com.acciojob.firstapiproject;

public class Threads {

    public static void main(String[] args) throws InterruptedException{


       NewThread thread = new NewThread();



       //Create a thread by implementing runnable interface,
       Thread newThread2 = new Thread(new NewThread2());

       newThread2.setPriority(1);

       newThread2.isAlive();

       //thread.start(); //This will automatically call the run method present there


        while(1>0){

            System.out.println("Thread went to sleep for 5 seconds");
            Thread.sleep(5000);
        }



    }
}

class NewThread2 implements Runnable{ //This is a better approach

    public void run() {

        //You can consider as the main function :

        //

    }
}



class NewThread extends Thread{


    @Override
    public void run() {

        while(1>0){
            System.out.println("I am in the new Thread !!!");
        }

    }
}
