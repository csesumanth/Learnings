public class PrintValue {

    public static void main(String[] args) {
        PrintValue printValue = new PrintValue();
        Person person = printValue.new Person();
        person.setName("inside main");
        System.out.println(person.getName());
        printValue.pName(person);
        System.out.println(person.getName());

    }

    private void pName(Person person){
        person = new Person();
        person.setName("inside pName");
        System.out.println("pName method = "+person.getName());

    }
    class Person{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
