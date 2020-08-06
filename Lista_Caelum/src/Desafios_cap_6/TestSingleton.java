package Desafios_cap_6;

public class TestSingleton {
	
	private static TestSingleton instanciaUnica=null;

    private TestSingleton() {
         
    }

    public static TestSingleton getInstancia(){

          if (instanciaUnica == null) {
        	  instanciaUnica = new TestSingleton();
          }
          
          return instanciaUnica;
    }
    
    public void hello(){
    	System.out.println("Sou única");
    }

}
	
	