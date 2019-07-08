package tasks;

public class User implements Comparable<User>
{
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    User(Integer id)
    {
        this.id = id;
    }

    public int compareTo(User other)
    {
        return this.id.compareTo(other.getId());
    }

    public boolean equals(User other)
    {
        return this.id.equals(other.getId());
    }
}
