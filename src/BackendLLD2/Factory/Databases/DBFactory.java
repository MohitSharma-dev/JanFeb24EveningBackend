package BackendLLD2.Factory.Databases;

public class DBFactory {
    public static Database createDatabase(String databaseName){
        if(databaseName.equals("mysql")){
            return new Mysql();
        } else if(databaseName.equals("postgresql")){
            return  new PGSql();
        } else if(databaseName.equals("mongoDb")){
            return  new Mongodb();
        }
        return null;
    }
}
