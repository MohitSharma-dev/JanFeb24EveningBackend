package BackendLLD2.Factory.Databases;

import BackendLLD2.Factory.Databases.Queries.Query;
import BackendLLD2.Factory.Databases.Transactions.Transaction;
import BackendLLD2.Factory.Databases.Updators.Updator;

public interface DatabaseFactory {
    Query createQuery();
    Transaction createTransaction();
    Updator createUpdator();
}
