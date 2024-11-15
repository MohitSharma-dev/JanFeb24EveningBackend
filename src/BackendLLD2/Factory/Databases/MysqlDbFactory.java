package BackendLLD2.Factory.Databases;

import BackendLLD2.Factory.Databases.Queries.Query;
import BackendLLD2.Factory.Databases.Transactions.Transaction;
import BackendLLD2.Factory.Databases.Updators.Updator;

public class MysqlDbFactory implements DatabaseFactory {
    @Override
    public Updator createUpdator() {
        return null;
    }

    @Override
    public Query createQuery() {
        return null;
    }

    @Override
    public Transaction createTransaction() {
        return null;
    }
}
