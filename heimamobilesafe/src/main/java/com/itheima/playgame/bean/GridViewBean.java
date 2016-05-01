package com.itheima.playgame.bean;

/**
 * Created by Administrator on 2016/4/17.
 */
public class GridViewBean {
    public String title;
    public String description;
    public int icon;

    public GridViewBean(String title, String description, int icon) {
        this.title = title;
        this.description = description;
        this.icon = icon;
    }



    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getIcon() {
        return icon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "GridViewBean{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
