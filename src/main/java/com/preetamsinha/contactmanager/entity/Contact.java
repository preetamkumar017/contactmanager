// Generated with g9.

package com.preetamsinha.contactmanager.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="contact")
public class Contact implements Serializable {

    /** Primary key. */
    protected static final String PK = "cId";

    @Id
    @Column(name="c_id", unique=true, nullable=false, precision=10)
    private int cId;
    @Column(length=500)
    private String description;
    @Column(length=255)
    private String email;
    @Column(length=255)
    private String image;
    @Column(length=255)
    private String name;
    @Column(length=255)
    private String phone;
    @Column(name="second_name", length=255)
    private String secondName;
    @Column(length=255)
    private String work;
    @ManyToOne
    @JoinColumn(name="user_id")
    private Users users;

    /** Default constructor. */
    public Contact() {
        super();
    }

    /**
     * Access method for cId.
     *
     * @return the current value of cId
     */
    public int getCId() {
        return cId;
    }

    /**
     * Setter method for cId.
     *
     * @param aCId the new value for cId
     */
    public void setCId(int aCId) {
        cId = aCId;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for image.
     *
     * @return the current value of image
     */
    public String getImage() {
        return image;
    }

    /**
     * Setter method for image.
     *
     * @param aImage the new value for image
     */
    public void setImage(String aImage) {
        image = aImage;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for phone.
     *
     * @return the current value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter method for phone.
     *
     * @param aPhone the new value for phone
     */
    public void setPhone(String aPhone) {
        phone = aPhone;
    }

    /**
     * Access method for secondName.
     *
     * @return the current value of secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Setter method for secondName.
     *
     * @param aSecondName the new value for secondName
     */
    public void setSecondName(String aSecondName) {
        secondName = aSecondName;
    }

    /**
     * Access method for work.
     *
     * @return the current value of work
     */
    public String getWork() {
        return work;
    }

    /**
     * Setter method for work.
     *
     * @param aWork the new value for work
     */
    public void setWork(String aWork) {
        work = aWork;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Users aUsers) {
        users = aUsers;
    }

    /**
     * Compares the key for this instance with another Contact.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Contact and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Contact)) {
            return false;
        }
        Contact that = (Contact) other;
        if (this.getCId() != that.getCId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Contact.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Contact)) return false;
        return this.equalKeys(other) && ((Contact)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getCId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Contact |");
        sb.append(" cId=").append(getCId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("cId", Integer.valueOf(getCId()));
        return ret;
    }

}
