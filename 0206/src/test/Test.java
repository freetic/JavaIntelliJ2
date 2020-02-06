//JDBC를 이용한 데이터베이스 연결 방법
//import java.sql.* -> 드라이버 로드 -> Connection객체 생성 -> Statement 객체를 생성 및 질의 수행
//-> SQL문에 결과물이 있다면 ResultSet 객체 생성 -> 모든 객체 닫기

package test;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String server = "localhost"; // MySQL 서버 주소
        String database = ""; // MySQL DATABASE 이름
        String user_name = "root"; //  MySQL 서버 아이디
        String password = "javamariadb"; // MySQL 서버 비밀번호

        // 1.드라이버 로딩
        try {
            con = Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }

        // 2.연결
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?useSSL=false", user_name, password);
            System.out.println("정상적으로 연결되었습니다.");


        } catch(SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        }

        // 3.해제
        try {
            if(con != null)
                con.close();
        } catch (SQLException e) {}
    }
}
