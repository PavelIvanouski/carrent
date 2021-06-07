package myapp.model.dao.impl;

import myapp.model.dao.EngineDao;
import myapp.model.entity.Engine;
import myapp.model.entity.Model;

import java.sql.*;
import java.util.List;

public class EngineDaoImpl implements EngineDao {
    public void delete(Engine engine) {

    }

    public void createOrUpdate(Engine engine) {

    }

    public Engine getEngineById(int id) throws SQLException {
        Engine engine = new Engine();

        Connection con = DriverManager.getConnection("url", "login", "password");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select *");
        while (rs.next()) {
            engine.setId(rs.getInt(1));
            engine.setName(rs.getString(2));
        }

        return engine;
    }

    public List<Engine> getAll() {

        return null;
    }
}
