package jpa;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table( name="DEMO_ACTIVITY_TYPE" )
public class ActivityType 
	implements Serializable
{
	private static final long serialVersionUID = 6552061558678462626L;
	
	@Id
	@Column( name="ACTIVITY_TYPE_CODE" )
	private int activityTypeCode;
	
	public ActivityType()
	{
		
	}

	public int getActivityTypeCode() {
		return activityTypeCode;
	}

	public void setActivityTypeCode(int activityTypeCode) {
		this.activityTypeCode = activityTypeCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
