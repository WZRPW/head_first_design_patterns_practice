package chapter17_inmemory_file_system;

public class File extends Entry {

    private String content; //maybe byte[]
    private int size;

    public File(String name, Directory parent, int size) {
        super(name, parent);
        this.size = size;
    }

    public int size() { return size; }

    public String getContent() { return content; }

    public void setContents(String content) {
        this.content = content;
    }
}
