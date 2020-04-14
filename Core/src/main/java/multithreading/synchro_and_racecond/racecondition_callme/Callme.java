package multithreading.synchro_and_racecond.racecondition_callme;

class Callme {
    void call(String message){
        System.out.print("[" + message);

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("]");
    }
}
