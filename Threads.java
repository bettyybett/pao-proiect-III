package proiect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Threads  implements Runnable  {

        String line = "";
        String csv_split = ",";
        BufferedWriter abw = null;
        FileWriter afw = null;

        private Thread t;
        private String threadName;

        Threads(String name) {
            try {
                afw = new FileWriter("C:\\Users\\Betty\\Desktop\\serviciu_audit.csv",true);
                abw = new BufferedWriter(afw);
                abw.write("\n-------------------------------\n");
                this.threadName = name;
                abw.write("Creating thread named " + name);
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            } finally {
                try {
                    if (abw != null)
                        abw.close();

                    if (afw != null)
                        afw.close();
                } catch (IOException ex) {
                    System.err.format("IOException: %s%n", ex);
                }
            }

        }

        @Override
        public void run() {
            try {
                afw = new FileWriter("C:\\Users\\Betty\\Desktop\\serviciu_audit.csv", true);
                abw = new BufferedWriter(afw);

                abw.write("Running " + threadName+"\n");
                try {
                        abw.write("Thread " + threadName +"\n");
                        Thread.sleep(10);

                } catch (InterruptedException e) {
                    abw.write("thread " + threadName + " interrupted\n");
                }
                abw.write("Thread " + threadName + " exiting\n");

            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            } finally {
                try {
                    if (abw != null)
                        abw.close();

                    if (afw != null)
                        afw.close();
                } catch (IOException ex) {
                    System.err.format("IOException: %s%n", ex);
                }
            }
        }
    public void start() {
        try {
            afw = new FileWriter("C:\\Users\\Betty\\Desktop\\serviciu_audit.csv",true);
            abw = new BufferedWriter(afw);
            abw.write("\n-------------------------------\n");
            abw.write("Starting " + threadName+"\n");
            if(t == null) {
                t = new Thread(this, threadName);
                t.start();
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (abw != null)
                    abw.close();

                if (afw != null)
                    afw.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }

    }
}
