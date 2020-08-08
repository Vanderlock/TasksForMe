 public class Example
   {
      public static void main(String[] args)
      {
   	 for ( int i = 0; i < args.length; i++ ){
		if (i<3){
   	    System.out.println( args[i] );
	}else{
		System.out.println("The result cannot be shown. The program can display only 3 command line arguments");
		}
	}
      }
   }