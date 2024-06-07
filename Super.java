public  class Dad{
    String name="Multan ";
    String surname="Chaudhary";

}
class Father extends Dad{
    String name="Bant ";

}
class Me extends Father{
    String name="Mehak";

}



 class Dadag {
    public static void main(String[]args){
        Me m =new Me();
        System.out.println(m.name);
        System.out.println(m.surname);

    }
}
