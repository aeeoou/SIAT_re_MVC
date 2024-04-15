package controller;

import model.MvcModel;
import view.MvcView;

// Controller :: 모든 사용자로부터의 요청을 컨트롤러에서 받는다.
/*
 * 사용자 입력을 처리하고 '모델'과 '뷰' 사이의 상호 작용을 관리한다.
 * 현 코드에서는 사용자로부터 이름과 비밀번호를 받아 모델에 설정하고, 뷰를 업데이트하여 변경된 데이터를 표시한다.
 */

// MvcController클래스 생성
public class MvcController {
	
	// 멤버 변수 선언
	private MvcModel model;
    private MvcView view;

    // MvcController클래스의 생성자를 정의. 두 개의 매개변수를 받는다.(MvcModel model, MvcView view)
    public MvcController(MvcModel model, MvcView view) {
        this.model = model;
        this.view = view;
    }
    
    // 사용자로부터 받은 입력을 처리
    // setUser(String username, String password) 메서드는 사용자가 제공한 이름과 비밀번호를 받아 모델에 설정하는 메서드이다.
    public void setUser(String username, String password) {
    	// MvcModel의 setUsername, setPassword를 호출하여 모델의 데이터를 업데이트한다.
        model.setUsername(username);
        model.setPassword(password);
    }
    // updateUser() 메서드는 model에서 사용자의 이름과 비밀번호를 가져와서 뷰를 업데이트하는 메서드. 
    public void updateUser() {
    	// MvcModel의 getUsername, getPassword를 호출하여 모델의 데이터를 얻은 후 view.UserInfo()를 호출하여 뷰 업데이트
        view.UserInfo(model.getUsername(), model.getPassword());
    }
}