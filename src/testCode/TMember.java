package testCode;


import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mainSource.Member;

public class TMember {
	// 독립된 단위 테스트를 하기 위해서는 라이브러리(JUnit)를 추가 한다
	// JUnit이란? // 독립된 단위 테스트를 지원해 주는 프레임워크
	
	/*// 사용되는 어노테이션
	 * @Test // @Test가 선언된 메서드가 테스트를 수행한다
	 * 
	 * @Before // @Test가 선언된 메서드가 실행되기 전에 수행
	 * 
	 * @Ignore // 테스트를 실행하지 않는다
	 */
	/*
	 * //sysout 으로는 콘솔에 결과를 출력하지만
	 * //단정(assert)메서드로 테스크의 결과를 판별한다 
	 * //예를 들어 assertEquals(예상값, 실제값)
	 * //위의 단정 메소드는 예상값과 실제값이 일치하면 성공, 일치ㄴㄴ 경우면 실패
	 */
	/*//jUnit 메소드
	 *  assertEquals(a, b) - 객체 또는 값이 일치하는가?
	 *  assertArrayEquls(a, b) - 배열의 값이 일치하는가?
	 *  assertSame(a, b) - 같은 객체인가?
	 *  assertTrue(a) - 조건이 참인가?
	 *  assertNotNull(a) - 객체가 null이 아닌가?
	 *  assertNull(a) - 객체가 null인가?
	 */
	
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
		//System.out.println(newMember);
		//System.out.println(oldMember);
		//assertEquals(newMember, oldMember); // 일치하지 않아서 ==> 다른 객체라서 Failures뜸
		//assertNotNull(newMember);
		//assertNull(newMember);
		//assertSame(newMember, oldMember); // 같은 객체인지 아닌지
		if(oldMember == null) {
			System.out.println("ok");
		}
		assertTrue(oldMember == null);
	}
	
//	@Ignore
//	public void test2() { // 같은 객체? 다른 객체? 의존성 파악
//		newMember = new Member();
//		oldMember = newMember;
//	}
	@Before
	public void test2() { // 같은 객체? 다른 객체? 의존성 파악
		newMember = new Member();
		oldMember = null;
	}
	
	
	
	
	
	
	
	
}
