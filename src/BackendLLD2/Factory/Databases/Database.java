package BackendLLD2.Factory.Databases;

import BackendLLD2.Factory.Databases.Queries.Query;
import BackendLLD2.Factory.Databases.Transactions.Transaction;
import BackendLLD2.Factory.Databases.Updators.Updator;

public interface Database {
    void getVersion();

//    factory methods
//    Query createQuery();
//    Transaction createTransaction();
//    Updator createUpdator();
    DatabaseFactory createDatabaseFactory();
}
