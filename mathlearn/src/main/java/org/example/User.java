package org.example;

public class User implements Cloneable{
    private String name;
    private int ID;
    private String path;
    private int[] data;

    public User() {
    }

    public User(String name, int ID, String path, int[] data) {
        this.name = name;
        this.ID = ID;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    @Override
protected Object clone() throws CloneNotSupportedException {
    User clonedUser = (User) super.clone();
    // Deep copy of the data array
    if (this.data != null) {
        clonedUser.data = this.data.clone();
    }
    return clonedUser;
}

    public String toString() {
        return "User{name = " + name + ", ID = " + ID + ", path = " + path + ", data = " + arrtostring() + "}";
    }
    private String arrtostring(){
        String arrsg = "[";
        for (int i = 0; i < data.length-1; i++) {
            arrsg = arrsg + data[i] + ",";
        }
        arrsg = arrsg + data[data.length-1] + "]";
        return arrsg;
    }
}
