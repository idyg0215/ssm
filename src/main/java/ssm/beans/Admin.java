package ssm.beans;



/**
 * Created by dyg on 2017/6/14.
 */
public class Admin {
    public int id;
    public String name;
    public Admin(){}
    public Admin(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
