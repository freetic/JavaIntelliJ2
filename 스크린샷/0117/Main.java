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
//		//�Է�
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Name : ");     String name = scan.next();
//		//�˻�
//		Emp result = null;   //��������
//		for(int i = 0 ; i < empArray.length ; i++) {
//			//���� i��° ����� �̸��� �Է��� ����� �̸��� ���ٸ�
//			if(empArray[i].geteName().equals(name)) {
//				result = empArray[i];  //ã�� ����� i��° ����̴�.
//			}
//		}
//		//System.out.println(result);   //result.toString()
//		int deptno = result.getDeptno();  //ã�� ����� �μ���ȣ
//		Dept result1 = null;
//		for(int i = 0 ; i < deptArray.length - 1 ; i++) {
//			//���� ã���� �ϴ� ��ȣ�� �μ��� �μ���ġ�˻�
//			if(deptArray[i].getDeptNo() == deptno)   result1 = deptArray[i];
//		}
//		//������
//		System.out.print("��� : ");    System.out.println(result.getEmpNo());
//		System.out.print("�̸� : ");    System.out.println(result.geteName());
//		System.out.print("���� : ");    System.out.println(result.getJob());
//		System.out.print("�Ҽ� �μ� �̸� : ");  System.out.println(result1.getdName());
//		System.out.print("�Ҽ� �μ� ��ġ : "); System.out.println(result1.getLoc());
		
		//Person person = new Person("��ö��", 24, "������ ���ﵿ");
		
		Person person;   //����
		person = new Student("��ö��", 24, "������ ���ﵿ", "2019-01", 90);
		System.out.println("ö���� ����");
		System.out.println(person);   //chulsu.toString()
		
		System.out.println("������ ����");
		
		person = new Employee("������", 34, "�λ�� �ؿ�뱸", "2018-05", 250);
		System.out.println(person);
				
		
		
		
		
		
		
	}
}



