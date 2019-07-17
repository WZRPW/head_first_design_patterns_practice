package chapter17_inmemory_file_system;

//1. File System class not done yet
import java.util.*;
import java.lang.String;

public class FileSystem {

    private final Directory root;
    public FileSystem() { root = new Directory("/", null); }

    public List<Entry> resolve(String path) {
        assert path.startsWith("/");
        String[] components = path.substring(1).split("/");
        List<Entry> entries = new ArrayList<Entry>(components.length + 1);
        entries.add(root);

        Entry entry = root;
        for (String component : components) {
            if (entry == null || !(entry instanceof Directory)) {
                throw new IllegalArgumentException("invalid path : " + path);
            }
            if (!component.isEmpty()) {
                entry = (Directory)entry.getChild(component);
                entries.add(entry);
            }
            return entries;
        }
    }


}
