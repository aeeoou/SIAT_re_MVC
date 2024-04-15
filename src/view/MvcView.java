package view;

// view :: 사용자 인터페이스를 표시한다.
/*
* 현 코드에서는 사용자의 이름과 비밀번호를 콘솔창에 출력하는 데 사용
* model의 데이터를 보여주는 역할이다.
*/

public class MvcView {
	
	// UserInfo메서드 생성 :: 매개변수로 받은 사용자 이름과 비밀번호를 사용하여 정보를 콘솔에 출력
    public void UserInfo(String username, String password) {
    	
        System.out.println("이름: " + username);
        System.out.println("비밀번호: " + password);
        
    }
}