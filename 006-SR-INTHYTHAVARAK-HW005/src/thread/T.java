package thread;

public class T extends Thread {
    public static final String ANSI_BLACK = "\033[0;30m";   //BLACK
    public static final String ANSI_CYAN = "\033[0;36m";    // CYAN
    public static final String ANSI_RED = "\033[0;31m";     // RED



    @Override
    public void run() {
        String command=ANSI_BLACK+ "HELLO KSHRD!!!!\n" +
                "*************************************\n"
                +"I will try my best to be here at HRD.\n"+
                "-------------------------------------\n"+
                "Downloading.........."+ANSI_BLACK;
        for (int i=0; i<command.length(); i++){
               System.out.print(command.charAt(i));

           try {
               Thread.sleep(200);
           }catch (InterruptedException e){ }
           super.run();

       }
        System.out.println("100%completed");
    }

    public static void main(String[] args) {
        System.out.println(ANSI_RED+"➜"+ANSI_CYAN+"Greeting:\t"+ANSI_BLACK +"jAVA Greeting");
        T t1 = new T();
        t1.start();

    }

}
