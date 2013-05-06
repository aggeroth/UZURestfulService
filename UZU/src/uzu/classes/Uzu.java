/**
 * 
 */
package uzu.classes;


/**
 * @author Marwan
 *
 */
public class Uzu {

	private long uzuID;
	private float longitude;
	private float latitude;
	private String subjectTitle;
	private String messageBody;
	private boolean hasImage;
	private long birth;
	private int life; 
	private long death;
	
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
		return hasImage;
	}

	/**
	 * @param hasImage the hasImage to set
	 */
	public void setHasImage(boolean hasImage) {
		this.hasImage = hasImage;
	}

	/**
	 * @return the birth
	 */
	public long getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(long birth) {
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
	public long getDeath() {
		return death;
	}

	/**
	 * @param death the death to set
	 */
	public void setDeath(long death) {
		this.death = death;
	}
	
}
