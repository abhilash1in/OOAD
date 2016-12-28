public class PrintSpooler {
    private volatile static PrintSpooler b = null;

    private PrintSpooler(){
    	// empty constructor
    }

    public static PrintSpooler getPrintSpooler(){
        if(b == null){
        	synchronized(PrintSpooler.class){
        		if(b == null)
        			b = new PrintSpooler();
        	}
            
        }else{
            System.out.println("PrintSpooler already initiallized. Returning existing PrintSpooler instance");
        }
        return b;
    }
}