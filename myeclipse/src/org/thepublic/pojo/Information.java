
package org.thepublic.pojo;


/**
 * Information entity. @author MyEclipse Persistence Tools
 */

public class Information implements java.io.Serializable
{


	// Fields

	private Integer IId;
	private Short IRequestPower;
	private Integer IRequestId;
	private Short IRespondPower;
	private Integer IRespondId;
	private String IMessage;


	// Constructors

	/** default constructor */
	public Information()
	{}


	/** full constructor */
	public Information(Short IRequestPower,
					   Integer IRequestId,
					   Short IRespondPower,
					   Integer IRespondId,
					   String IMessage)
	{
		this.IRequestPower = IRequestPower;
		this.IRequestId = IRequestId;
		this.IRespondPower = IRespondPower;
		this.IRespondId = IRespondId;
		this.IMessage = IMessage;
	}


	// Property accessors

	public Integer getIId()
	{
		return this.IId;
	}

	public void setIId(Integer IId)
	{
		this.IId = IId;
	}

	public Short getIRequestPower()
	{
		return this.IRequestPower;
	}

	public void setIRequestPower(Short IRequestPower)
	{
		this.IRequestPower = IRequestPower;
	}

	public Integer getIRequestId()
	{
		return this.IRequestId;
	}

	public void setIRequestId(Integer IRequestId)
	{
		this.IRequestId = IRequestId;
	}

	public Short getIRespondPower()
	{
		return this.IRespondPower;
	}

	public void setIRespondPower(Short IRespondPower)
	{
		this.IRespondPower = IRespondPower;
	}

	public Integer getIRespondId()
	{
		return this.IRespondId;
	}

	public void setIRespondId(Integer IRespondId)
	{
		this.IRespondId = IRespondId;
	}

	public String getIMessage()
	{
		return this.IMessage;
	}

	public void setIMessage(String IMessage)
	{
		this.IMessage = IMessage;
	}


}
