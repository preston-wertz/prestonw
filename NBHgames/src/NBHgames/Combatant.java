package NBHgames;

import java.util.Random;

public class Combatant
{
	private int speed;
	String name;
	point position;
	boolean isDead;
	Random r = new Random();
	public Combatant(String n,point p)
	
	{
		this.name = n;
		this.position = p;
		
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public void move()
	{
		if(position.x >= 10)
		{
			position.x -= speed;
		}
		else if(position.x <= -10)
		{
			position.x += speed;
		}
		else position.x += r.nextInt(speed)-(speed/2);
		
		if(position.y >= 10)
		{
			position.y -= speed;
		}
		else if(position.y <= -10)
		{
			position.y += speed;
		}
		else position.y += r.nextInt(speed)-(speed/2);
	}
	public void fight(Combatant other)	
	{
		if(this.isDead || other.isDead)
		{
			return;
		}
		if(this instanceof Ninja)
		{
			if(other instanceof Hunter)
			{
				other.isDead = true;
				System.out.println(name + " wins");
			}
			if(other instanceof Bear)
			{
				this.isDead = true;
				System.out.println(other.name + " wins");

			}
		}
		if(this instanceof Hunter)
		{
			if(this instanceof Bear)
			{
				other.isDead = true;
				System.out.println(name + " wins");
			}
			if(this instanceof Ninja)
			{
				this.isDead =  true;
				System.out.println(other.name + " wins");
			}
		}
		if(this instanceof Bear)
		{
			if(this instanceof Ninja)
			{
				other.isDead = true;
				System.out.println(name + " wins");
			}
			if(this instanceof Hunter)
			{
				this.isDead = true;
				System.out.println(other.name + " wins");
			}
		}
		
	}
	
}

