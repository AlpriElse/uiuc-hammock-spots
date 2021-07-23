package xyz.alprielse.uiuc_hammock_spots.db;

import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;
import xyz.alprielse.uiuc_hammock_spots.core.ImmutableTree;

public class  TreeDAO extends AbstractDAO<ImmutableTree> {
    public TreeDAO(SessionFactory factory) {
        super(factory);
    }

    public ImmutableTree create(ImmutableTree tree) {
        return persist(tree);
    }
}
