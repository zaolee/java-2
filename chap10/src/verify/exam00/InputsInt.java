package verify.exam00;
public class InputsInt {
  public boolean isDuplicate(int [] da){
    boolean isD=false;
    for(int i=0;i<da.length;i++){
      for(int j=i;j<da.length;j++){
		  if(i!=j && da[i]==da[j]){
			isD=true;
			break;
		  }
	  }
    }
    return isD;
  }//
  public int[] input(int n,int start,int end){ //(10,0,9)
    int [] num=new int[n];
    int count=0;
    while(true){
      try{
        int a=Integer.parseInt(
			javax.swing.JOptionPane.showInputDialog(null,
			(count+1)+" ��° ���� �����ÿ�"));
        if(a>=start && a<=end){
          num[count++]=a;
        }else{
          throw new Exception("������ �� ���Ǿ����ϴ�.\n �ٽ� �Է��Ͻÿ�");
        }
         if(count>=n){break;}
      }catch(NumberFormatException ee){
        javax.swing.JOptionPane.showMessageDialog(null,
			"�߸��� �������� �ԷµǾ����ϴ�.\n�ٽ� �Է��Ͻÿ�");
      }catch(Exception ee){
        javax.swing.JOptionPane.showMessageDialog(null,ee.getMessage());
      }
    }
    return num;
  }//
  public int[] input(int n,int start,int end,boolean b){ //(10,0,9,false)
    int[] num = new int[n];
    int count = 0;
    if(b==false){
        while(true){
          num=input(n,start,end);
          if(isDuplicate(num)){
            javax.swing.JOptionPane.showMessageDialog(null,
				"�ߺ��Ǿ����ϴ�.\n�ٽ� �Է��Ͻÿ�");
          }else{
            break;
          }
        }
    }else{
      num=input(n,start,end);
    }
    return num;
  }//
  public void prints(int [] a){
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+"  ");
    }
  }//
}//class