package BackendLLD2.Factory.Databases;

import BackendLLD2.Factory.Databases.Queries.NoSQLQuery;
import BackendLLD2.Factory.Databases.Queries.Query;
import BackendLLD2.Factory.Databases.Queries.SQLQuery;

public class QueryFactory {
    public static Query getQueryByDatabase(Database database) {
        Query query = null;
        if(database instanceof Mysql){
            query = new SQLQuery();
        } else if (database instanceof Mongodb){
            query = new NoSQLQuery();
        }
        return query;
    }
}
