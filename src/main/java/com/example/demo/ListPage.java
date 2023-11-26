package com.example.demo;

import java.util.List;

public class ListPage<T> {
    // 当前第几页
    private int pageIndex;
    // 一共多少页
    private int pageCount;
    // 一共多少行
    private int total;
    // 显示的数据
    private List<T> rows;
    // 总数据

    public int getPageIndex(){return this.pageIndex;}
    public void setPageIndex(int value){this.pageIndex = value;}
    public int getPageCount(){return this.pageCount;}
    public void setPageCount(int value){this.pageCount = value;}
    public int getTotal(){
        return total;
    }
    public void setTotal(int value){
        this.total = value;
    }
    public List<T> getRows(){return this.rows;}
    public void setRows(List<T> value){this.rows = value;}
}
