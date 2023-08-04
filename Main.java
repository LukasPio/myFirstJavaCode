    package cursoDeJava.conteudoInicial;

    public class Main {

        //Declaration of the class
        public static class MultiplicationClass {

            //Declaration of function to do x * y
            public int multiplicationFunction (int x, int y) {

                return x * y;

            }

        }

        public static void main(String[] args) {

            // Declaration of function in the main class
            MultiplicationClass multiplication = new MultiplicationClass();

            // Calling the multiplication Function
            System.out.println(multiplication.multiplicationFunction(10, 4));
        }
    }
