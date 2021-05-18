package learn.java.patterns.creational;

public class BillPughSingleton {

	
	public static void main(String[] args) {
		System.out.println(getInstance().hashCode());
		
		System.out.println("----------");
		
		System.out.println(getInstance().hashCode());
	}
	

	private BillPughSingleton(){
		//System.out.println("Inside constructor !!!");
	}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
    	//System.out.println("Inside getInstance() !!!");
        return SingletonHelper.INSTANCE;
    }
    
	
}
