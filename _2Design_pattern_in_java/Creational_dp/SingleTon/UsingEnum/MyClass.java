package _2Design_pattern_in_java.Creational_dp.SingleTon.UsingEnum;

enum MyClass {
    
        INSTANCE("Amol");
    
        private String name;
    
        MyClass(String name) {
            this.name = name;
        }
    
        public void printHello() {
            System.out.println("Hello " + this.name);
        }
   
    
}
