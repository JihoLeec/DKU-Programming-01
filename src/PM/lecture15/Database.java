package PM.lecture15;

public class Database {
    static String dbName;
    static int count;
    static String[] tables;

    static {
        dbName = "MainDB";
        count = 0;

        tables = new String[3];
        tables[0] = "USERS";
        tables[1] = "GAMES";
        tables[2] = "SCHOOL";
    }
    // 정적 초기화 블록 클래스가 메모리에 로딩될 때 자동으로 한 번 실행

}
