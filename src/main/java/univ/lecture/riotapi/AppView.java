package univ.lecture.riotapi;
public class AppView {
	
	public void outputResult(double aValue) {
		System.out.println("\n[최종값] " + aValue + "\n");
	}
	
	public void outputMessage(MessageID aMessageID) {
		if (aMessageID == MessageID.NOTICESTARTPROGRAM){
			System.out.println(" :: 프로그램을 시작합니다. ::");
		}
		
		else if (aMessageID == MessageID.ERRORINPUT)
			System.out.println("ERROR: 잘못된 입력입니다.");
		
		else if (aMessageID == MessageID.NOTICEENDPROGRAM)
			System.out.println(" :: 프로그램을 종료합니다. ::");
	}
	
}
