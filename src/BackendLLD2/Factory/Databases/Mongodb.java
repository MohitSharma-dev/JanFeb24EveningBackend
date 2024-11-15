package BackendLLD2.Factory.Databases;

import BackendLLD2.Factory.Databases.Queries.NoSQLQuery;
import BackendLLD2.Factory.Databases.Queries.Query;
import BackendLLD2.Factory.Databases.Queries.SQLQuery;
import BackendLLD2.Factory.Databases.Transactions.Transaction;
import BackendLLD2.Factory.Databases.Updators.Updator;

public class Mongodb implements Database{
    @Override
    public void getVersion() {

    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MongoDbFactory();
    }
}
