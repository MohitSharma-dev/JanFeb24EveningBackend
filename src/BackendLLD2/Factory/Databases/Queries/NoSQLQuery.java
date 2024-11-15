package BackendLLD2.Factory.Databases.Queries;

public class NoSQLQuery implements Query{
    private String query;

    @Override
    public String getQuery() {
        return query;
    }
}
