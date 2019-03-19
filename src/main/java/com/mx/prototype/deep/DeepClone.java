package com.mx.prototype.deep;

import java.io.*;
import java.util.List;

/**
 * @author feifan
 * @time 2019/03/19
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class DeepClone implements Serializable {
    private static final long serialVersionUID = -5578744217630094409L;
    private long id;

    private String name;

    private List list;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object deepClone(){
        Object copy = null;
        ObjectOutputStream out  = null;
        ObjectInputStream in = null;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            out = new ObjectOutputStream(baos);
            out.flush();
            out.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            in = new ObjectInputStream(bais);

            copy = in.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(null != out){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return copy;

    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
