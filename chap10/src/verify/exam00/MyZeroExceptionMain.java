package verify.exam00;
import javax.swing.JOptionPane;
public class MyZeroExceptionMain
{
	public static void main(String[] args) 
	{
		try{
			int num=makeNum();
		}catch(Exception ee){
			System.out.println(ee);
		}finally{System.exit(1);}//console���� gui���
		
	}
	public static int makeNum() throws MyZeroException{
		int b=0;
		try{
			b=Integer.parseInt(
				 JOptionPane.showInputDialog(null,"���ڸ� �����ÿ�"));
		}catch(Exception ee){//NumberFormatException �߻�
			throw new MyZeroException("���ڸ� �־��!!!!");
		}
		return b;
	}
}
