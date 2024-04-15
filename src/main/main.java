package main;

import controller.MvcController;
import model.MvcModel;
import view.MvcView;

// main :: 프로그램의 진입점
/*
* 컨트롤러, 모델, 뷰를 생성하고 초기화한다.
* 현 코드에서는 사용자의 이름과 비밀번호를 설정하고 입력된 데이터를 콘솔창에 출력한다.
*/

public class main {

	public static void main(String[] args) {
		
		// 모델, 뷰, 컨트롤러 객체 생성
	    MvcModel model = new MvcModel("", "");
	    MvcView view = new MvcView();
	    // MvcController객체를 생성하고, 이전에 생성한 모델과 뷰를 전달하여 초기화한다.
	    MvcController controller = new MvcController(model, view);
	    
	    // 정보 설정
	    controller.setUser("서형종", "19910409");
	     
	    // 정보를 콘솔창에 출력
	    controller.updateUser();
	}
}
