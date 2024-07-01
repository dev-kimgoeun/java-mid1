package nested.nested.ex1;

public class Network {

    public void sentMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
