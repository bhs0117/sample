import static org.junit.Assert.*;

import org.junit.Test;

public class CalcuratorTest {

	@Test //<- 테스트 대산 메소드 선언 의미 
	public void testSum() {
		Calcurator c = new Calcurator();
		double result = c.sum(10, 50);
		assertEquals(60, result, 0);
				// 예상값 , 실제결과값 , 허용오차(생략가능)
		//assert메서드 
		/*
		 	assertArrayEquals(a,b) : 배열 a,b가 일치함을 확인 
		 	assertEquals(a,b) 객체 a,b의 값이 같은지 확인 
		 	assertSame(a,b) 객체 a,b가 같은 객체임을 확인
		  	assertTrue(a) a가 참인지 확인 
		  	assertNotNull(a) a객체가 null이 아님을 확인 
	
 	    */
		//@BeforeClass : 테스크 클래스 수행시 단위 테스트보다 먼저 딱 한 번 수행 되어야 할 경우 지정 
		
		//@BeforeClass ,@AfterClass 메소드 -> 테스트클래스에서 딱 한번씩만 수행되도록 지정하는 어노테이션
		//@Before     , After 
	}
}