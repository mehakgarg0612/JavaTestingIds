
public class Local_inst_sta {

    class Example {
        int instanceVar; // Instance variable (default value: 0)
        static int staticVar; // Static variable (default value: 0)

        void display() {
            int localVar = 5; // Local variable (must be initialized)
            System.out.println(localVar);
        }
    }

    class Main {
        public static void main(String[] args) {
            //Example obj = new Example();
           /* System.out.println(obj.instanceVar); // ✅ Allowed, Output: 0
            System.out.println(Example.staticVar); // ✅ Allowed, Output: 0
            obj.display(); // Output: 5 */
        }
    }
    
} 
