class NamedCow extends Cow
{
  private String myName;
  private String myType;
  private String mySound;
  public NamedCow (String type, String name, String sound) {
    myName = name;
    myType = type;
    mySound = sound;
  }  
  public String getName() {
    return myName;
  }
}