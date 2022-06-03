package lesson10;

/**
 * ��������� ������ � ���������
 * 
 * @author nedis
 * @version 1.0
 */
public interface IMatrix {
	
	/**
	 * ������ ������� ��� ������������ ��� ����������
	 */
	int DEFAULT_MATRIX_SIZE = 1;
	
	/**
	 * ���������� ���������� ����� �������
	 * 
	 * @return ���������� ����� �������
	 */
	int getRows();
	
	/**
	 * ���������� ���������� �������� �������
	 * 
	 * @return ���������� �������� �������
	 */
	int getColumns();
	
	/**
	 * ���������� ������� ������� �� ��������
	 * 
	 * @param rowIndex ������ ������ 
	 * @param colIndex ������ �������
	 * @return ������� ������� �� ��������
	 * @throws IndexOutOfBoundsException ���� ������ ������ ������ ���� ��� ������ (��� �����) ���������� ����� �������
	 * 			��� ������ ������� ������ ���� ��� ������ (��� �����) ���������� �������� �������
	 */
	double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException;
	
	/**
	 * ������������� ������� ������� �� ��������
	 * 
	 * @param rowIndex ������ ������ 
	 * @param colIndex ������ �������
	 * @param value ����� �������� ��������
	 * @throws IndexOutOfBoundsException ���� ������ ������ ������ ���� ��� ������ (��� �����) ���������� ����� �������
	 * 			��� ������ ������� ������ ���� ��� ������ (��� �����) ���������� �������� �������
	 */
	void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException;
	
	/**
	 * ���������� ����� ������� ������� � ������� ���������. <br/>
	 * <b><i>(����� ���������� ������� ������� ������� �� ������ ���� ��������! ��������� �������� - ����� ������ �������) </i></b>
	 * 
	 * @param otherMatrix ������ �������� (�������)
	 * @return ����� ������ <b><i>(����� ������ �������)</i></b>
	 * @throws IllegalArgumentException ���� ������� ������� � ������ �������� ����� ������������� ���������� ����� � (���) ��������
	 * @throws NullPointerException ���� ������ �������� null
	 */
	IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException;
	
	/**
	 * ���������� �������� ������� ������� � ������� ���������.<br/>
	 * <b><i>(����� ���������� ������� ������� ������� �� ������ ���� ��������! ��������� �������� - ����� ������ �������) </i></b> 
	 * 
	 * @param otherMatrix ������ �������� (�������)
	 * @return �������� ������ <b><i>(����� ������ �������)</i></b>
	 * @throws IllegalArgumentException ���� ������� ������� � ������ �������� ����� ������������� ���������� ����� � (���) ��������
	 * @throws NullPointerException ���� ������ �������� null
	 */
	IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException;
	
	/**
	 * ���������� ������������ ������� ������� � ������� ���������.<br/>
	 * <b><i>(����� ���������� ������� ������� ������� �� ������ ���� ��������! ��������� �������� - ����� ������ �������) </i></b> 
	 * 
	 * @param otherMatrix ������ �������� (�������)
	 * @return ������������ ������ <b><i>(����� ������ �������)</i></b>
	 * @throws IllegalArgumentException ���� ������� ������� � ������ �������� ����� ������������� ���������� ����� � (���) ��������
	 * @throws NullPointerException ���� ������ �������� null
	 */
	IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException;
	
	/**
	 * ���������� ������������ ������� ������� �� �����.<br/>
	 * <b><i>(����� ���������� ������� ������� ������� �� ������ ���� ��������! ��������� �������� - ����� ������ �������) </i></b>
	 * 
	 * @param value �����
	 * @return ������������ <b><i>(����� ������ �������)</i></b>
	 */
	IMatrix mul(double value);
	
	/**
	 * ���������� ����������������� ������� �� ��������� � �������
	 * 
	 * @return ����������������� ������� �� ��������� � �������
	 */
	IMatrix transpose();
	
	/**
	 * ��������� ������ ������� ������� ���������
	 * 
	 * @param value ��������
	 */
	void fillMatrix(double value);
	
	/**
	 * ��������� ����������� �������.<br/>
	 * �������� ��������� ��� ����� ������� ���: <a target="_blank" href="http://ru.wikipedia.org/wiki/LU-%D1%80%D0%B0%D0%B7%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5">LU-����������</a>
	 * 
	 * @return �����������
	 */
	double determinant();
	
	/**
	 * ��������� �������� �� ������� ������� �������<br/>
	 * ������� ������� - ������� � ������� ��� �������� ����:
	 * 
	 * <table>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * </table>
	 * 
	 * @return <b>true</b> ���� ������� ������� �������
	 */
	boolean isNullMatrix();
	
	/**
	 * ��������� �������� �� ������� ������� ���������<br/>
	 * ��������� ������� - ������� � ������� �� ������� ��������� �������, � ��������� �������� ����:
	 * 
	 * <table>
	 * <tr><td>&nbsp;&nbsp;1&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;1&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;1&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;1&nbsp;&nbsp;</td></tr>
	 * </table>
	 * 
	 * @return <b>true</b> ���� ������� ������� ���������
	 */
	boolean isIdentityMatrix();
	
	/**
	 * ��������� �������� �� ������� ������� ����������. <br/>
	 * �.�. ������� � ������� ���������� ����� ����� ���������� ��������<br/>
	 * 
	 * @return <b>true</b> ���� ������� ������� ����������
	 */
	boolean isSquareMatrix();
	
	/**
	 * ����� ������� �� �������
	 * @see System.out.println()
	 * @return
	 */
	void printToConsole();
}
