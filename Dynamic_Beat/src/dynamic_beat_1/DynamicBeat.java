package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		// ����� Ÿ��Ʋ
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		// frame�� ũ��
		setResizable(false);
		// â�� ũ�� ���� ���� ����
		setLocationRelativeTo(null);
		// �������� �� ȭ���� ���߾ӿ� ���� ��.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// â�� �������� �� ���α׷��� �����ϰ� �Ѵ�
		setVisible(true);
		// â�� ���̰� �Ѵ�
	}
	

}
