package model.repository;

import model.entity.Sarbaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SarbazDBImpl implements AutoCloseable, SarbazDB {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public SarbazDBImpl() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abolfazl"
                    , "root", "Am311865186");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean save(Sarbaz sarbaz) {
        try {
            preparedStatement = connection.prepareStatement("insert into sarbaz (first_name , last_name ," +
                    "tedad_morekhasi , id)values (?,?,?,?)");
            preparedStatement.setString(1, sarbaz.getFirstName());
            preparedStatement.setString(2, sarbaz.getLast_name());
            preparedStatement.setString(3, String.valueOf(sarbaz.getTedadMorekhasi()));
            preparedStatement.setString(4, String.valueOf(sarbaz.getId()));
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Sarbaz sarbaz) {
        try {
            preparedStatement = connection.prepareStatement("update sarbaz set tedad_morekhasi = ? where id = ?" +
                    " and first_name = ? and last_name = ?");
            preparedStatement.setString(1, String.valueOf(sarbaz.getTedadMorekhasi()));
            preparedStatement.setString(2, String.valueOf(sarbaz.getId()));
            preparedStatement.setString(3, sarbaz.getFirstName());
            preparedStatement.setString(4, sarbaz.getLast_name());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public int delete(Sarbaz sarbaz) {
        try {
            preparedStatement = connection.prepareStatement("delete from sarbaz where id = ? and " +
                    "first_name = ? and last_name = ?");
            preparedStatement.setString(1, String.valueOf(sarbaz.getId()));
            preparedStatement.setString(2, sarbaz.getFirstName());
            preparedStatement.setString(3, sarbaz.getLast_name());
            return preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    @Override
    public List<Sarbaz> showAll() {
        try {
            List<Sarbaz> sarbazs = new ArrayList<>();
            preparedStatement = connection.prepareStatement("select * from sarbaz");
            ResultSet set = preparedStatement.executeQuery();
            while (set.next()) {
                Sarbaz sarbaz = new Sarbaz();
                sarbaz.setFirstName(set.getString("first_name"));
                sarbaz.setLast_name(set.getString("last_name"));
                sarbaz.setId(set.getLong("id"));
                sarbaz.setTedadMorekhasi(set.getInt("tedad_morekhasi"));
                sarbazs.add(sarbaz);
            }
            return sarbazs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Sarbaz estelam(long id) {
        try {
            Sarbaz sarbaz = new Sarbaz();
            preparedStatement = connection.prepareStatement("select * from sarbaz where id = ?");
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet set = preparedStatement.executeQuery();
            if (set.next()){
                sarbaz.setFirstName(set.getString("first_name"));
                sarbaz.setLast_name(set.getString("last_name"));
                sarbaz.setId(set.getLong("id"));
                sarbaz.setTedadMorekhasi(set.getInt("tedad_morekhasi"));
            }
            return sarbaz;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean ayaMorekhasiDari(long id , int tedad ) {
        try {
            preparedStatement = connection.prepareStatement("select  tedad_morekhasi from sarbaz where id = ?");
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet set = preparedStatement.executeQuery();
            if (set.next())
            {
                if (set.getInt("tedad_morekhasi")>= tedad)
                    return true;
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }

    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();
    }
}
