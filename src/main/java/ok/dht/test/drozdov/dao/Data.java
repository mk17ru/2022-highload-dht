package ok.dht.test.drozdov.dao;

import java.io.IOException;
import java.util.Iterator;

public interface Data {
    Iterator<Entry> iterator() throws IOException;
}
