package practice.springbasic;

public class Database {
    /**
     * CREATE SINGLETON DESIGN PATTERN OBJECT
     */

    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    private Database() {

    }
}
