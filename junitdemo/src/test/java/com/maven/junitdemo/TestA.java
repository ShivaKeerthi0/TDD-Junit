package com.maven.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestA {
	Remove r;
   @BeforeEach
   void setup() {
	   r=new Remove();
   }
   /*
    * 1.4 chars: ABCD =BCD-Success
    * 2.4 chars: AACD =CD-Success
    * 3.4 chars: BACD = BCD-Success
    * 4.4 chars: BBAA = BBAA-Success
    * 5.5 chars: AABAA = BAA-Success
    * 6.1 char: A = A-Success
    * 7.1 char: B = B-Success
    */
   
	@Test
void test1() {
		
		assertEquals("BCD", r.modify("ABCD"));
	}
	@Test
    void test2() {
    	
		assertEquals("CD", r.modify("AACD"));
	}
	@Test
   void test3() {
	
	assertEquals("BCD", r.modify("BACD"));
     }
	@Test
    void test4() {
	
	assertEquals("BBAA", r.modify("BBAA"));
     }
	@Test
    void test5() {
	
	assertEquals("BAA", r.modify("AABAA"));
     }
	@Test
    void test6() {
	
	assertEquals("", r.modify("A"));
     }
	@Test
    void test7() {
	
	assertEquals("B", r.modify("B"));
     }

}
