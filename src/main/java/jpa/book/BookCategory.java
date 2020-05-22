package jpa.book;

import javax.persistence.*;
import java.lang.String;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
@IdClass(BookCategoryPK.class)
public class BookCategory {

    @Id
    @Column(name = "categoryid")
    private String categoryid;

    public BookCategory(String catId, String comId, String catName, Book... b1) {
        setCategoryid(catId);
        setCompanyid(comId);
        setCategoryname(catName);
        setBooks(b1);
    }
    public void setBooks(Book... books) {
        this.books = Stream.of(books).collect(Collectors.toSet());
//        this.phones.forEach(x -> x.setEmployee(this));
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String value) {
        this.categoryid = value;
    }

    @Id
    @Column(name = "companyid")
    private String companyid;

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String value) {
        this.companyid = value;
    }

    @Column(name = "categoryname")
    private String categoryname;

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String value) {
        this.categoryname = value;
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumns({
            @JoinColumn(name = "catid", referencedColumnName = "categoryid"),
            @JoinColumn(name = "comid", referencedColumnName = "companyid"),

    })
    private Set<Book> books;


    public BookCategory() {
    }
    public BookCategory(String catId, String comId, String catName) {
        setCategoryid(catId);
        setCompanyid(comId);
        setCategoryname(catName);

    }
}
