package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

//import HelloWorld;

public class HelloWorldTest {
	@Test
	public void testHelloWorld(){
		HelloWorld hello = new HelloWorld();
		assertEquals("Test 1", "Hello World", hello.sayHello());
			
	}
//	/*
	@Test
	public void test4HelloWorld(){
		HelloWorld hello = new HelloWorld();
		assertEquals("Test 1.2", "Helllllllo World", hello.sayHello());
	
	}
	@Test
	public void test2HellowWorld(){
		HelloWorld hello = new HelloWorld();
		assertEquals("Test 2", "Hello World", hello.sayHello());
	}
	@Test
	public void test3HellowWorld(){
		HelloWorld hello = new HelloWorld();
		assertEquals("Test 3", "Hello World   ", hello.sayHello());
	}
//	*/
/*	
	@Test
	public void testLoadButton(){
		MainPanel _m;
		LoadButton newButton = new LoadButton(_m);
		assertNotNull(newButton);
	}
*/	
}
