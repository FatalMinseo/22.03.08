import java.util.ArrayList;

public class Main {
	// ��Ӱ� ������
	// ��� : �����޾Ƽ� Ȯ���Ų��.

	public static void main(String[] args) {

		PtkJjajang ptkJjajang = new PtkJjajang();
		PjeJjajang pjeJjajang = new PjeJjajang();
		PwjJjajang pwjJjajang = new PwjJjajang();
		PmsJjajang pmsJjajang = new PmsJjajang();

		PbkJjajang p1 = ptkJjajang;
		PbkJjajang p2 = pjeJjajang;
		PbkJjajang p3 = pwjJjajang;
		PbkJjajang p4 =	pmsJjajang;
		
		p1.makeJjajang();
//		p1.makeBingSu(); �߻�Ŭ���� Ÿ������ �ٲ� �Ƶ� Ÿ���� ����
		PtkJjajang newPtkJjajang = (PtkJjajang)p1;
		newPtkJjajang.makeBingSu();
		
		ArrayList<PbkJjajang> list = new ArrayList<PbkJjajang>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		CjiJjajang chChiJjajang =new CjiJjajang();
		chChiJjajang.makeJjajang();

	}
}