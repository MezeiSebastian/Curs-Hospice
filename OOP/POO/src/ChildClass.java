public class ChildClass extends ParentClass implements ParentInterface{
    @Override
    public void displayText() {
        System.out.println(text);
    }

    @Override
    public void ShowParentClassMessage() {
        System.out.println(message);
    }
}
