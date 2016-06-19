package mylengthUtil;
import junit.framework.TestCase;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/20/16.
 */
public class MyLengthTest extends TestCase {

	/*
	 * 'mylengthUtil.MyLength.setLength(int, int)' のためのテスト・メソッド
	 */
	public void testSetLength() {

		//1フィート2インチが正しく設定されているかテストする
		MyLength len = new MyLength();
		len.setLength(1, 2);
		assertEquals( "フィートは1のはず", 1, len.getFeet() );
		assertEquals( "インチは2のはず", 2, len.getInch() );

		//0フィート14(=12+2)インチが正しく設定されているかテストする
		len.setLength(0, 14);
		assertEquals( "フィートは1のはず", 1, len.getFeet() );
		assertEquals( "インチは2のはず", 2, len.getInch() );
	}

	/*
	 * 'mylengthUtil.MyLength.getFeet()' のためのテスト・メソッド
	 */
	public void testGetFeet() {
		//1フィート2インチが正しく設定されているかテストする
		MyLength len = new MyLength();
		len.setLength(1, 2);
		assertEquals( "フィートは1のはず", 1, len.getFeet() );
	}

	/*
	 * 'mylengthUtil.MyLength.getInch()' のためのテスト・メソッド
	 */
	public void testGetInch() {
		//1フィート2インチが正しく設定されているかテストする
		MyLength len = new MyLength();
		len.setLength(1, 2);
		assertEquals( "インチは2のはず", 2, len.getInch() );
	}

	/*
	 * 'mylengthUtil.MyLength.add(MyLength)' のためのテスト・メソッド
	 */
	public void testAdd() {
		// 1feet2inch + 1feet11inch = 3feet1inch となっているかをテストする
		MyLength expected = new MyLength();
		expected.setLength( 3, 1);
		MyLength len1 = new MyLength();
		len1.setLength( 1, 2);
		MyLength len2 = new MyLength();
		len2.setLength( 1, 11);
		MyLength actual;
		actual = len1.add( len2);

		assertEquals("合計長さのフィートは3のはず", 3, actual.getFeet());
		assertEquals("合計長さのインチは1のはず", 1, actual.getInch());
	}

}