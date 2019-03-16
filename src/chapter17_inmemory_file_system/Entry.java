package chapter17_inmemory_file_system;

//Question: when to prefer an abstract class over interface?
public abstract class Entry {
    protected Directory parent;
    protected long created;
    protected long lastUpdated;
    protected long lastAccessed;
    protected String name;

    public boolean delete() {
        if (parent == null) { return false; }
        return parent.deleteEntry(this);
    }

    public abstract int szie();

    public String getFullPath() {
        if (parent == null) {
            return name;
        } else {
            return parent.getFullPath() + "/" + name;
        }
    }

    public long getCreationTime() { return created; }

    public long getLastUpdateTime() { return lastUpdated; }

    public long getLastAccessed() { return lastAccessed; }

    public void changeName(String name) { this.name = name; }

    public String getName() { return name; }
}
