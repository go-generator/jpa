package jpa.book;

import java.io.Serializable;
import java.util.Objects;

public class BookCategoryPK implements Serializable {
    
     private String categoryid;

    public BookCategoryPK(String a, String abc) {
        this.categoryid = a;
        this.companyid = abc;
    }

    public String getCategoryid() {
        return categoryid;
     }

     public void setCategoryid(String value) {
        this.categoryid = value;
     }
    
     private String companyid;

     public String getCompanyid() {
        return companyid;
     }

     public void setCompanyid(String value) {
        this.companyid = value;
     }
    
     public BookCategoryPK() {
     }

     @Override
     public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookCategoryPK pk = (BookCategoryPK) o;
        
        if (!(Objects.equals(getCategoryid(), pk.getCategoryid()))) {
            return false;
        }
        if (!(Objects.equals(getCompanyid(), pk.getCompanyid()))) {
            return false;
        }
        return true;
     }

    @Override
     public int hashCode() {
        return Objects.hash(getCategoryid(),getCompanyid());
     }
}