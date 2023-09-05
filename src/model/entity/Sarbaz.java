package model.entity;

public class Sarbaz {
    private String firstName;
    private String last_name;
    private int tedadMorekhasi;
    private long id;

    @Override
    public String toString() {
        return "Sarbaz { " +
                "firstName = '" + firstName + '\'' +
                ", last_name = '" + last_name + '\'' +
                ", tedadMorekhasi = " + tedadMorekhasi +
                ", id = " + id +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getTedadMorekhasi() {
        return tedadMorekhasi;
    }

    public void setTedadMorekhasi(int tedadMorekhasi) {
        this.tedadMorekhasi = tedadMorekhasi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
