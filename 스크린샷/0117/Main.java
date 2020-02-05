import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Dept [] deptArray = new Dept[5]; 
//		Dept newYork = new Dept(10, "ACCOUNTING","NEW YORK"); 
//		Dept dallas = new Dept(20, "RESEARCH", "DALLAS"); 
//		Dept chicago = new Dept(30, "SALES", "CHICAGO"); 
//		Dept boston = new Dept(40, "OPERATIONS", "BOSTON");
//		  
//		deptArray[0] = newYork;    deptArray[1] = dallas; 
//		deptArray[2] = chicago;     deptArray[3] = boston;
//		  
//		Emp[] empArray = new Emp[14];
//		empArray[0] = new Emp(7369, "SMITH", "CLERK", 7902, "80/12/17", 800, 0, 20);
//		empArray[1] = new Emp(7499, "ALLEN", "SALESMAN", 7698, "81/02/20", 1600, 300, 30);
//		empArray[2] = new Emp(7521, "WARD", "SALESMAN", 7698, "81/02/22", 1250, 500, 30);
//		empArray[3] = new Emp(7566, "JONES", "MANAGER", 7839, "81/04/02", 2975, 0, 20);
//		empArray[4] = new Emp(7654, "MARTIN", "SALESMAN", 7698, "81/09/28", 1250, 1400, 30);
//		empArray[5] = new Emp(7698, "BLAKE", "MANAGER", 7839, "81/05/01", 2850, 0, 30);
//		empArray[6] = new Emp(7782, "CLARK", "MANAGER", 7839, "81/06/09", 2450, 0, 10);
//		empArray[7] = new Emp(7788, "SCOTT", "ANALYST", 7566, "87/04/19", 3000, 0, 20);
//		empArray[8] = new Emp(7839, "KING", "PRESIDENT", 0, "81/11/17", 5000, 0, 10);
//		empArray[9] = new Emp(7844, "TURNER", "SALESMAN", 7698, "81/09/08", 1500, 0, 30);
//		empArray[10] = new Emp(7876, "ADAMS", "CLERK", 7788, "87/05/23", 1100, 0, 20);
//		empArray[11] = new Emp(7900, "JAMES", "CLERK", 7698, "81/12/03", 950, 0, 30);
//		empArray[12] = new Emp(7902, "FORD", "ANALYST", 7566, "81/12/03", 3000, 0, 20);
//		empArray[13] = new Emp(7934, "MILLER", "CLERK", 7782, "82/01/23", 1300, 0, 10);
//
//		//입력
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Name : ");     String name = scan.next();
//		//검색
//		Emp result = null;   //지역변수
//		for(int i = 0 ; i < empArray.length ; i++) {
//			//만일 i번째 사원의 이름이 입력한 사원의 이름과 같다면
//			if(empArray[i].geteName().equals(name)) {
//				result = empArray[i];  //찾은 사원이 i번째 사원이다.
//			}
//		}
//		//System.out.println(result);   //result.toString()
//		int deptno = result.getDeptno();  //찾은 사원의 부서번호
//		Dept result1 = null;
//		for(int i = 0 ; i < deptArray.length - 1 ; i++) {
//			//만일 찾고자 하는 번호의 부서와 부서위치검색
//			if(deptArray[i].getDeptNo() == deptno)   result1 = deptArray[i];
//		}
//		//결과출력
//		System.out.print("사번 : ");    System.out.println(result.getEmpNo());
//		System.out.print("이름 : ");    System.out.println(result.geteName());
//		System.out.print("직무 : ");    System.out.println(result.getJob());
//		System.out.print("소속 부서 이름 : ");  System.out.println(result1.getdName());
//		System.out.print("소속 부서 위치 : "); System.out.println(result1.getLoc());
		
		//Person person = new Person("김철수", 24, "강남구 역삼동");
		
		Person person;   //선언
		person = new Student("김철수", 24, "강남구 역삼동", "2019-01", 90);
		System.out.println("철수의 정보");
		System.out.println(person);   //chulsu.toString()
		
		System.out.println("지민의 정보");
		
		person = new Employee("한지민", 34, "부산시 해운대구", "2018-05", 250);
		System.out.println(person);
				
		
		
		
		
		
		
	}
}



