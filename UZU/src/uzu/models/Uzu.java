/**
 * 
 */
package uzu.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Marwan
 *
 */

@Entity
@Table(name="items")
public class Uzu implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="itemID")
	private long uzuID;
	
	@Column(name="longitude")
	private float longitude;
	
	@Column(name="latitude")
	private float latitude;
	
	@Column(name="subject")
	private String subjectTitle;
	
	@Column(name="message")
	private String messageBody;
	
	@Column(name="hasImages")
	private boolean hasImages;
	
	@Column(name="birth")
	private Timestamp birth;
	
	@Column(name="life")
	private int life;
	
	@Column(name="death")
	private Timestamp death;
	
	@Column(name="categoryID")
	private int categoryID;
	
	@Column(name="zombie")
	private boolean zombie;
	
	public Uzu(int id) {
		uzuID = id;
		subjectTitle = "subject 000" + id;
	}

	/**
	 * @return the uzuID
	 */
	public long getUzuID() {
		return uzuID;
	}

	/**
	 * @param uzuID the uzuID to set
	 */
	public void setUzuID(long uzuID) {
		this.uzuID = uzuID;
	}

	/**
	 * @return the longitude
	 */
	public float getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public float getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the subjectTitle
	 */
	public String getSubjectTitle() {
		return subjectTitle;
	}

	/**
	 * @param subjectTitle the subjectTitle to set
	 */
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}

	/**
	 * @return the messageBody
	 */
	public String getMessageBody() {
		return messageBody;
	}

	/**
	 * @param messageBody the messageBody to set
	 */
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	/**
	 * @return the hasImage
	 */
	public boolean isHasImage() {
		return hasImages;
	}

	/**
	 * @param hasImage the hasImage to set
	 */
	public void setHasImage(boolean hasImage) {
		this.hasImages = hasImage;
	}

	/**
	 * @return the birth
	 */
	public Timestamp getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}

	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}

	/**
	 * @param life the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}

	/**
	 * @return the death
	 */
	public Timestamp getDeath() {
		return death;
	}

	/**
	 * @param death the death to set
	 */
	public void setDeath(Timestamp death) {
		this.death = death;
	}

	/**
	 * @return the categoryID
	 */
	public int getCategoryID() {
		return categoryID;
	}

	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	/**
	 * @return the zombie
	 */
	public boolean isZombie() {
		return zombie;
	}

	/**
	 * @param zombie the zombie to set
	 */
	public void setZombie(boolean zombie) {
		this.zombie = zombie;
	}
	
}
