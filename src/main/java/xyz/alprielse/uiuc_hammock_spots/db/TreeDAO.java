package xyz.alprielse.uiuc_hammock_spots.db;

import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;
import xyz.alprielse.uiuc_hammock_spots.core.Tree;

import java.util.List;

public class  TreeDAO extends AbstractDAO<Tree> {
    public TreeDAO(SessionFactory factory) {
        super(factory);
    }

    public Tree create(Tree tree) {
        return persist(tree);
    }

    public List<Tree> findAll() {
        return list(namedTypedQuery("xyz.alprielse.uiuc_hammock_spots.core.Tree.findAll"));
    }
}
