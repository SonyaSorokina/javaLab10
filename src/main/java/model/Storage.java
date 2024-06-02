package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private Database database;

    public static final String DB_URL = "jdbc:mysql://localhost:3306/DB";
    public static final String DB_LOGIN = "root";
    public static final String DB_PASSWORD = "root";

    public List<Textile> getTextiles() throws SQLException
    {
        List<Textile> TextileList = new ArrayList<>();

        database = new Database(DB_URL, DB_LOGIN, DB_PASSWORD);

        ResultSet resultSet = database.executeQuery("SELECT name, comp, color, country, pattern, id FROM storage"); // name, comp, color, country, pattern
        while (resultSet.next())
        {
            TextileList.add(new Textile(
                    resultSet.getInt(6),
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5)
            ));
        }
        return TextileList;
    }

    public void addTextile(Textile textile) throws SQLException
    {
        database = new Database(DB_URL, DB_LOGIN, DB_PASSWORD);

        database.executeQuery(String.format("INSERT INTO storage (name, comp, color, country, pattern) " +
                        "VALUES ('%s', '%s', '%s', '%s', '%s')",
                textile.getName(), textile.getCompound(), textile.getColor(), textile.getCountry(), textile.getPattern()));
        database.closeConnection();
    }

    public void removeTextileById(int textileId) throws SQLException
    {
        database = new Database(DB_URL, DB_LOGIN, DB_PASSWORD);
        database.executeQuery(String.format("DELETE FROM storage WHERE id=%d", textileId));
        database.closeConnection();
    }

    public void updateTextileById(int textileId, Textile textile) throws SQLException
    {
        database = new Database(DB_URL, DB_LOGIN, DB_PASSWORD);

        database.executeQuery(String.format("UPDATE storage SET name='%s', comp='%s', color='%s', country='%s', pattern='%s' " +
                        "WHERE id=%d",
                textile.getName(), textile.getCompound(), textile.getColor(), textile.getCountry(), textile.getPattern(), textileId));

        database.closeConnection();
    }
}
