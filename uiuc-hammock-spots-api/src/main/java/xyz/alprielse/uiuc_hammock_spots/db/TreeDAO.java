package xyz.alprielse.uiuc_hammock_spots.db;

import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import xyz.alprielse.uiuc_hammock_spots.core.Tree;

import java.util.List;

@RegisterConstructorMapper(Tree.class)
public interface TreeDAO {
    @SqlQuery("SELECT * FROM trees")
    List<Tree> findAll();
}
