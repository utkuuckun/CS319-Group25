
public class MysteryBox extends Collectable {
	
	public MysteryBox()
	{
		super((int)(Math.random()* 7 + 1));
		super.setImage("mysteryBox.png");
	}
}
