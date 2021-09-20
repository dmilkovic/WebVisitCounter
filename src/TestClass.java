public class TestClass {
    String name;
    int id;
    TestClass(String name, int id){
            this.id = id;
            this.name = name;
    }

    public void greet(){
        System.out.println("Hello my name is: " + name + " and mi ID is: " + id);
    }
}
