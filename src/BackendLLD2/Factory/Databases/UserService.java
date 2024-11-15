package BackendLLD2.Factory.Databases;

import AbstractClasses.User;
import BackendLLD2.Factory.Databases.Queries.NoSQLQuery;
import BackendLLD2.Factory.Databases.Queries.Query;
import BackendLLD2.Factory.Databases.Queries.SQLQuery;
import BackendLLD2.Factory.Databases.Transactions.Transaction;
import BackendLLD2.Factory.Databases.Updators.Updator;

public class UserService {

    private Database database;

    UserService(Database database) {
        this.database = database;
    }

    public void createUser(User user) {
        Query q = QueryFactory.getQueryByDatabase(database);
    }

    public void deleteUser(User user) {
//        single factory method
//        Query q = database.createQuery();
    }

    public void updateUser(User user) {
        DatabaseFactory databaseFactory = database.createDatabaseFactory();
//        if(database instanceof Mysql){
//            databaseFactory = new MysqlDbFactory();
//        } else if(database instanceof Mongodb){
//            databaseFactory = new MongoDbFactory();
//        }
        Query q = databaseFactory.createQuery();
        Transaction t = databaseFactory.createTransaction();
        Updator updator = databaseFactory.createUpdator();
    }
}
