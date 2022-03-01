public class Main {
    public static void main(String[] args) {
        FunctionProduct functionProduct = new FunctionProduct();
        functionProduct.createObj();
        functionProduct.addProduct();
        functionProduct.arrayList.forEach(k -> System.out.println(k));


        String path = "arrayList.txt";
        functionProduct.writeToFile(functionProduct.arrayList, path);


        functionProduct.readFromFile(path);
    }
}
