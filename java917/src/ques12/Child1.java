package ques12;


	sealed class Base permits Child1,Child2{
	    void display(){
	        System.out.println("This is Base Class");
	    }
	}
	final class Child1 extends Base{
	    void display(){
	        System.out.println("This is Child1 Class");
	    }
	}
	non-sealed class Child2 extends Base{
	    void display(){
	        System.out.println("This is Child2 Class");
	    }
	}
	
	   
