package oop.chap07.poly;
// �߻�Ŭ���� - abstract�� �ǹ�
/*
 * �̿ϼ��� Ŭ����, ��� ������ �������� ���� Ŭ������ �ϼ����� �ʾ����Ƿ� ��ü������ �� �� ����.
 * 				-----------------	
 * 					�޼ҵ��� body�� �������� ���� �޼ҵ带 ���� �ִ� Ŭ����(�߻�޼���)
 * 
 * 1) �߻�޼��带 �����ϴ� ���
 *    ����������abstract ����Ÿ�� �޼ҵ��(�Ű�����.....);
 *    => �߻�޼��尡 ���ǵ� Ŭ������ �̿ϼ��� �߻�Ŭ������ �ǹǷ� �Ϲ� Ŭ������ �ٸ���.
 *       �߻�Ŭ������ �����ϴ� ��� Ŭ���� ����ο��� abstract�� �߰��ؾ� �Ѵ�.
 * 2) �߻�Ŭ������ Ư¡
 *    - �Ϲݸ޼���� �߻�޼��� ��� ������ �� �ִ�.
 *    - �߻�޼��尡 �� ���� ���ǵǾ� �ִ� Ŭ������ �ݵ�� abstract�� �߰��ؾ� �Ѵ�.
 *    - �߻�Ŭ������ �ν��Ͻ�ȭ �� �� ����.(��ü�����Ұ���)
 *    - �߻�Ŭ������ ����ϸ� ������ �߻��Ѵ�.
 *      => AbstractSubŬ�������� abstract�޼��带 ���� �ִ� AbstractSuperŬ������ ����ϸ鼭
 *         AbstractSubŬ������ �߻�Ŭ������ ����ȴ�. 
 *         
 *    [�ذ���]
 *    1. ����Ŭ������ ���� �����̶�� Ŭ���� ����ο� abstract �߰��Ѵ�.
 *    2. ��� �߻�޼ҵ带 �ݵ�� �������̵� �ؾ��Ѵ�.
 *    
 * 3) �߻�Ŭ������ �߻�޼��带 �ۼ��ϴ� ����
 *    - �������� �����ϱ� ����
 *    - ����Ŭ������ ����ϱ� ���� ����(��ü������ �������� �����ϱ� ����)
 *    - ����Ŭ�������� �ݵ�� �������ؾ��ϴ� �޼��带 �������� �����Ͽ� �ݵ�� �������ϵ��� �ϱ� ���ؼ�
 *    
 *    
*/
abstract class AbstractSuper {
	public abstract void show();
	public void display() {	// �Ϲݸ޼���
		System.out.println("display");
	}
}
class AbstractSub extends AbstractSuper {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractTest {

	public static void main(String[] args) {
		AbstractSuper obj = new AbstractSub();

	}

}