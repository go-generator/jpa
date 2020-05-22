package jpa.book;

import javax.persistence.*;
import java.lang.String;

@Entity

public class Book { 
     @Id
     @Column(name = "id")
     private String id;

     public String getId() {
          return id;
     }

     public void setId(String value) {
          this.id = value;
     }
     
     @Column(name = "catid")
     private String catid;

     public String getCatid() {
         return catid;
     }

     public void setCatid(String value) {
         this.catid = value;
     }
     @Column(name = "comid")
     private String comid;

     public String getComid() {
         return comid;
     }

     public void setComid(String value) {
         this.comid = value;
     }
     @Column(name = "name")
     private String name;

     public String getName() {
         return name;
     }

     public void setName(String value) {
         this.name = value;
     }

     public Book() {
     }
     public Book(String id, String bookName) {
          setId(id);
          setName(bookName);
     }
}
