package strings.model;

public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	private String topic;
	
	public Kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "nobody";
		this.isJumble = false;
		this.topic = "jhhjjh jh ";
	}
	
	public Kahoot(String creator, int questionCount, String topic)
	{
		this.creator = creator;
		this.questionCount = questionCount;
		this.topic = topic;
	}
	
	public String toString()
	{
		String description = "This kahoot was made by" + creator + " and has " + questionCount + " questions.";
		
		return description;
	}


public String getCreator()
{
	return creator;
}
public String getTopic()
{
	return topic;
}
}