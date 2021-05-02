package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		// 배너의 타이틀
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		// frame의 크기
		setResizable(false);
		// 창의 크기 조절 가능 여부
		setLocationRelativeTo(null);
		// 실행했을 때 화면의 정중앙에 오게 됨.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창을 종료했을 때 프로그램을 종료하게 한다
		setVisible(true);
		// 창이 보이게 한다
	}
	

}
