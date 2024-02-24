// Generated with g9.

package com.preetamsinha.contactmanager.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class Users implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    @Id
    @Column(nullable=false, precision=10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length=500)
    private String about;
    @Column(unique=true, length=255)
    @NotBlank(message = "Can not be empty")
    private String email;
    @Column(nullable=false, length=1)
    private boolean enabled;
    @Column(name="image_url", length=255)
    private String imageUrl;
    @Column(length=255)
    @Size(min = 2,max = 20,message = "min 2 char and max 20char allowed")
    @NotBlank(message = "Can not be empty")
    private String name;
    @Column(length=255)
    @NotBlank(message = "Can not be empty")
    private String password;
    @Column(length=255)
    private String role;
    @OneToMany(mappedBy="users")
    private Set<Contact> contact;

    /** Default constructor. */
    public Users() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for about.
     *
     * @return the current value of about
     */
    public String getAbout() {
        return about;
    }

    /**
     * Setter method for about.
     *
     * @param aAbout the new value for about
     */
    public void setAbout(String aAbout) {
        about = aAbout;
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
     * Access method for enabled.
     *
     * @return true if and only if enabled is currently true
     */
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter method for enabled.
     *
     * @param aEnabled the new value for enabled
     */
    public void setEnabled(boolean aEnabled) {
        enabled = aEnabled;
    }

    /**
     * Access method for imageUrl.
     *
     * @return the current value of imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter method for imageUrl.
     *
     * @param aImageUrl the new value for imageUrl
     */
    public void setImageUrl(String aImageUrl) {
        imageUrl = aImageUrl;
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
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
    }

    /**
     * Access method for role.
     *
     * @return the current value of role
     */
    public String getRole() {
        return role;
    }

    /**
     * Setter method for role.
     *
     * @param aRole the new value for role
     */
    public void setRole(String aRole) {
        role = aRole;
    }

    /**
     * Access method for contact.
     *
     * @return the current value of contact
     */
    public Set<Contact> getContact() {
        return contact;
    }

    /**
     * Setter method for contact.
     *
     * @param aContact the new value for contact
     */
    public void setContact(Set<Contact> aContact) {
        contact = aContact;
    }

    /**
     * Compares the key for this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Users and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Users)) {
            return false;
        }
        Users that = (Users) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Users)) return false;
        return this.equalKeys(other) && ((Users)other).equalKeys(this);
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
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
   

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

	@Override
	public String toString() {
		return "Users [id=" + id + ", about=" + about + ", email=" + email + ", enabled=" + enabled + ", imageUrl="
				+ imageUrl + ", name=" + name + ", password=" + password + ", role=" + role + ", contact=" + contact
				+ "]";
	}

    
}
