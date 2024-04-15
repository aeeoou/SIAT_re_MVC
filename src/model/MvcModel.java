package model;

// model :: 데이터를 처리하는 영역
/*
* 현 코드에서는 사용자의 이름과 비밀번호를 저장하는 데 사용된다.
* 사용자가 변경한 데이터를 유지하고, 변경된 데이터에 엑세스할 수 있는 메서드를 제공한다.
* 데이터베이스와 연동을 위한 DAO(Data Access Object) 와 데이터의 구조를 표현하는 DO(Data Object)로 구성된다.
*/

// MvcModel 클래스 생성
public class MvcModel {
	
	// 외부에서 직접적으로 접근할 수 없는 username, password 변수 생성 (데이터 저장용)
	private String username;
	private String password;
	
	// MvcModel클래스의 생성자. 생성자는 클래스의 인스턴스가 생성될 때 호출되는 특수 메서드로, 주로 클래스의 초기화를 담당
	public MvcModel(String username, String password) {
		this.username = username;
		this.password = password;
		}
	
	// 사용자 이름 반환 (username 멤버 변수의 값을 반환한다)
	public String getUsername() {
		return username;
		}
	// 사용자 이름 설정 (매개변수로 전달된 사용자 이름을 클래스의 'username'멤버 변수에 할당)
	public void setUsername(String username) {
		this.username = username;
		}
	
	public String getPassword() {
		return password;
		}
 
	public void setPassword(String password) {
		this.password = password;
		}
}