package Repository;

import Model.Entities.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ClientRepository implements Repository {
    private HashMap<String, Client> usernameClient;
    private HashMap<String, String> usernamePassword;

    public ClientRepository() {
        usernamePassword = new HashMap<String,String>();
        usernameClient = new HashMap< String,Client>();
    }

    @Override
    public void register(String username, String pwd, Object obj) {
        usernameClient.put(username, (Client) obj);
        usernamePassword.put(username, pwd);
    }

    public List<Client> getAll() {
        return new ArrayList<Client>(usernameClient.values());
    }

    public List<Client> getByUsername(String username) {
        List<Client> client = new ArrayList<Client>();
        client.add(usernameClient.get(username));
        return client;
    }
}
