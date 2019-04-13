package org.clothocad.hibernate.data;
// Generated Oct 12, 2010 7:14:51 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * TraitFamilyXref generated by hbm2java
 */
public class TraitFamilyXref  implements java.io.Serializable {


     private TraitFamilyXrefId id;
     private TraitTable traitTable;
     private FamilyTable familyTable;
     private Integer position;
     private Date dateCreated;
     private Date lastModified;

    public TraitFamilyXref() {
    }

	
    public TraitFamilyXref(TraitFamilyXrefId id, TraitTable traitTable, FamilyTable familyTable) {
        this.id = id;
        this.traitTable = traitTable;
        this.familyTable = familyTable;
    }
    public TraitFamilyXref(TraitFamilyXrefId id, TraitTable traitTable, FamilyTable familyTable, Integer position, Date dateCreated, Date lastModified) {
       this.id = id;
       this.traitTable = traitTable;
       this.familyTable = familyTable;
       this.position = position;
       this.dateCreated = dateCreated;
       this.lastModified = lastModified;
    }
   
    public TraitFamilyXrefId getId() {
        return this.id;
    }
    
    public void setId(TraitFamilyXrefId id) {
        this.id = id;
    }
    public TraitTable getTraitTable() {
        return this.traitTable;
    }
    
    public void setTraitTable(TraitTable traitTable) {
        this.traitTable = traitTable;
    }
    public FamilyTable getFamilyTable() {
        return this.familyTable;
    }
    
    public void setFamilyTable(FamilyTable familyTable) {
        this.familyTable = familyTable;
    }
    public Integer getPosition() {
        return this.position;
    }
    
    public void setPosition(Integer position) {
        this.position = position;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Date getLastModified() {
        return this.lastModified;
    }
    
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }




}

