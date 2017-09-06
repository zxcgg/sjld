package cn.cwx521.pojo;

import java.util.List;

public class PageBean1 {
    private long total;
    private List<?> rows;

    public PageBean1(long total,List<?> rows) {
        this.total=total;
        this.rows=rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
    @Override
    public String toString() {
        return "PageBean{" +
                "total=" + total +
                ", rows=" + rows+ "}";
    }
}
