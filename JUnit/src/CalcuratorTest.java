import static org.junit.Assert.*;

import org.junit.Test;

public class CalcuratorTest {

	@Test //<- �׽�Ʈ ��� �޼ҵ� ���� �ǹ� 
	public void testSum() {
		Calcurator c = new Calcurator();
		double result = c.sum(10, 50);
		assertEquals(60, result, 0);
				// ���� , ��������� , ������(��������)
		//assert�޼��� 
		/*
		 	assertArrayEquals(a,b) : �迭 a,b�� ��ġ���� Ȯ�� 
		 	assertEquals(a,b) ��ü a,b�� ���� ������ Ȯ�� 
		 	assertSame(a,b) ��ü a,b�� ���� ��ü���� Ȯ��
		  	assertTrue(a) a�� ������ Ȯ�� 
		  	assertNotNull(a) a��ü�� null�� �ƴ��� Ȯ�� 
	
 	    */
		//@BeforeClass : �׽�ũ Ŭ���� ����� ���� �׽�Ʈ���� ���� �� �� �� ���� �Ǿ�� �� ��� ���� 
		
		//@BeforeClass ,@AfterClass �޼ҵ� -> �׽�ƮŬ�������� �� �ѹ����� ����ǵ��� �����ϴ� ������̼�
		//@Before     , After 
	}
}