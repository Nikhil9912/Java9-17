package java917.ques8;


	class MyResource1 implements AutoCloseable{
	    void openResource(){
	        System.out.println("MyResource1 Opened");
	    }
	    void displayResource(){
	        System.out.println("MyResource1 running");
	    }
	    @Override
	    public void close() throws Exception {
	        System.out.println("MyResource1 closed");
	    }

}
